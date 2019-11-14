package com.fiixsoftware.challenges.rpgbot.services;

import com.fiixsoftware.challenges.rpgbot.persistence.models.Affection;
import com.fiixsoftware.challenges.rpgbot.persistence.models.GameEntity;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Statement;
import com.fiixsoftware.challenges.rpgbot.persistence.models.types.GameEntityType;
import com.fiixsoftware.challenges.rpgbot.persistence.models.types.StatementType;
import com.fiixsoftware.challenges.rpgbot.persistence.repositories.AffectionRepository;
import com.fiixsoftware.challenges.rpgbot.persistence.repositories.RelationshipRepository;
import com.fiixsoftware.challenges.rpgbot.utilities.TestModelBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class LoveServiceTest
{
	@InjectMocks
	private LoveService sut;

	@Mock
	private AffectionRepository mockedAffectionRepository;

	@Mock
	private RelationshipRepository mockedRelationshipRepository;

	@Mock
	private InventoryService mockedInventoryService;

	@Test
	public void testPlayerFlirtWithNPCWithNoPriorAffection()
	{
		GameEntity testProvider = TestModelBuilder.buildGameEntity(GameEntityType.PLAYER);
		GameEntity testRecipient = TestModelBuilder.buildGameEntity(GameEntityType.NPC);
		Statement testStatement = TestModelBuilder.buildStatement(StatementType.FLIRT);

		Affection outputAffection = sut.flirtWith(testProvider, testRecipient, testStatement);
		assertEquals("Affection should be from the recipient", testRecipient, outputAffection.getEntityWithAffection());
		assertEquals("Affection should be toward the provider", testProvider, outputAffection.getEntityAffectionIsToward());
		assertTrue("Affection should be greater than the starting amount.", outputAffection.getAmountOfAffection() > Affection.STARTING_AFFECTION);
		verify(mockedAffectionRepository, times(1)).save(any());
	}

	@Test
	public void testPlayerFlirtWithNPCIncreasesAffection()
	{
		long initialAffection = Affection.STARTING_AFFECTION;
		GameEntity testProvider = TestModelBuilder.buildGameEntity(GameEntityType.PLAYER);
		GameEntity testRecipient = TestModelBuilder.buildGameEntity(GameEntityType.NPC);
		Affection testAffection = TestModelBuilder.buildAffection(testRecipient, testProvider, initialAffection);
		testRecipient.getAffections().add(testAffection);
		Statement testStatement = TestModelBuilder.buildStatement(StatementType.FLIRT);

		Affection outputAffection = sut.flirtWith(testProvider, testRecipient, testStatement);
		assertEquals("Affection should be from the recipient", testRecipient, outputAffection.getEntityWithAffection());
		assertEquals("Affection should be toward the provider", testProvider, outputAffection.getEntityAffectionIsToward());
		assertTrue("Affection should be greater than what it wsa initially.", outputAffection.getAmountOfAffection() > initialAffection);
		verify(mockedAffectionRepository, times(1)).save(any());
	}

	@Test
	public void testPlayerFlirtWithNPCAffectionIsAlreadyAtMaximum()
	{
		GameEntity testProvider = TestModelBuilder.buildGameEntity(GameEntityType.PLAYER);
		GameEntity testRecipient = TestModelBuilder.buildGameEntity(GameEntityType.NPC);
		Affection testAffection = TestModelBuilder.buildAffection(testRecipient, testProvider, Affection.MAXIMUM_AFFECTION);
		testRecipient.getAffections().add(testAffection);
		Statement testStatement = TestModelBuilder.buildStatement(StatementType.FLIRT);

		Affection outputAffection = sut.flirtWith(testProvider, testRecipient, testStatement);
		assertEquals("Affection should be from the recipient", testRecipient, outputAffection.getEntityWithAffection());
		assertEquals("Affection should be toward the provider", testProvider, outputAffection.getEntityAffectionIsToward());
		assertEquals("Affection amount should remain at the maximum.", Affection.MAXIMUM_AFFECTION, outputAffection.getAmountOfAffection());
		verify(mockedAffectionRepository, times(1)).save(any());
	}

	@Test
	public void testPlayerFlirtWithRecipientIsNotAnNPC()
	{
		GameEntity testProvider = TestModelBuilder.buildGameEntity(GameEntityType.PLAYER);
		GameEntity testRecipient = TestModelBuilder.buildGameEntity(GameEntityType.DOOR);
		Statement testStatement = TestModelBuilder.buildStatement(StatementType.FLIRT);

		Affection outputAffection = sut.flirtWith(testProvider, testRecipient, testStatement);
		assertNull(outputAffection);
		verify(mockedAffectionRepository, never()).save(any());
	}

	@Test
	public void testPlayerFlirtWithNonFlirtStatementAndNoPriorAffectionReducesAffectionBelowStartingAmount()
	{
		GameEntity testProvider = TestModelBuilder.buildGameEntity(GameEntityType.PLAYER);
		GameEntity testRecipient = TestModelBuilder.buildGameEntity(GameEntityType.NPC);
		Statement testStatement = TestModelBuilder.buildStatement(StatementType.INSULT);

		Affection outputAffection = sut.flirtWith(testProvider, testRecipient, testStatement);
		assertEquals("Affection should be from the recipient", testRecipient, outputAffection.getEntityWithAffection());
		assertEquals("Affection should be toward the provider", testProvider, outputAffection.getEntityAffectionIsToward());
		assertTrue("Affection should be below the starting amount.", outputAffection.getAmountOfAffection() < Affection.STARTING_AFFECTION);
		verify(mockedAffectionRepository, times(1)).save(any());
	}

	@Test
	public void testPlayerFlirtWithStatementIsNotAFlirtReducesAffection()
	{
		long initialAffection = Affection.STARTING_AFFECTION;
		GameEntity testProvider = TestModelBuilder.buildGameEntity(GameEntityType.PLAYER);
		GameEntity testRecipient = TestModelBuilder.buildGameEntity(GameEntityType.NPC);
		Affection testAffection = TestModelBuilder.buildAffection(testRecipient, testProvider, initialAffection);
		testRecipient.getAffections().add(testAffection);
		Statement testStatement = TestModelBuilder.buildStatement(StatementType.INSULT);

		Affection outputAffection = sut.flirtWith(testProvider, testRecipient, testStatement);
		assertEquals("Affection should be from the recipient", testRecipient, outputAffection.getEntityWithAffection());
		assertEquals("Affection should be toward the provider", testProvider, outputAffection.getEntityAffectionIsToward());
		assertTrue("Affection should be lower than what it wsa initially.", outputAffection.getAmountOfAffection() < initialAffection);
		verify(mockedAffectionRepository, times(1)).save(any());
	}

	@Test
	public void testPlayerFlirtWithNonFlirtStatementCannotReduceAffectionBelowZero()
	{
		GameEntity testProvider = TestModelBuilder.buildGameEntity(GameEntityType.PLAYER);
		GameEntity testRecipient = TestModelBuilder.buildGameEntity(GameEntityType.NPC);
		Affection testAffection = TestModelBuilder.buildAffection(testRecipient, testProvider, Affection.MINIMUM_AFFECTION);
		testRecipient.getAffections().add(testAffection);
		Statement testStatement = TestModelBuilder.buildStatement(StatementType.INSULT);

		Affection outputAffection = sut.flirtWith(testProvider, testRecipient, testStatement);
		assertEquals("Affection should be from the recipient", testRecipient, outputAffection.getEntityWithAffection());
		assertEquals("Affection should be toward the provider", testProvider, outputAffection.getEntityAffectionIsToward());
		assertEquals("Affection should be remain at the minimum.", Affection.MINIMUM_AFFECTION, outputAffection.getAmountOfAffection());
		verify(mockedAffectionRepository, times(1)).save(any());
	}
}
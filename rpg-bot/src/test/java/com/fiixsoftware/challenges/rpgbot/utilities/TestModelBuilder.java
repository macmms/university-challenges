package com.fiixsoftware.challenges.rpgbot.utilities;

import com.fiixsoftware.challenges.rpgbot.persistence.models.Affection;
import com.fiixsoftware.challenges.rpgbot.persistence.models.GameEntity;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Statement;
import com.fiixsoftware.challenges.rpgbot.persistence.models.types.GameEntityType;
import com.fiixsoftware.challenges.rpgbot.persistence.models.types.StatementType;

import java.util.List;

public class TestModelBuilder
{
	public static GameEntity buildGameEntity(GameEntityType entityType)
	{
		GameEntity testEntity = new GameEntity();
		testEntity.setGameEntityType(entityType);
		return testEntity;
	}

	public static Affection buildAffection(GameEntity owner, GameEntity recipient, long amount)
	{
		Affection testAffection = new Affection();
		testAffection.setEntityWithAffection(owner);
		testAffection.setEntityAffectionIsToward(recipient);
		testAffection.setAmountOfAffection(amount);
		return testAffection;
	}

	public static Statement buildStatement(StatementType statementType)
	{
		Statement testStatement = new Statement();
		testStatement.setStatementType(statementType);
		return testStatement;
	}
}

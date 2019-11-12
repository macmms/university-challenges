package com.fiixsoftware.challenges.rpgbot.services;

import com.fiixsoftware.challenges.rpgbot.persistence.repositories.AffectionRepository;
import com.fiixsoftware.challenges.rpgbot.persistence.repositories.RelationshipRepository;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class LoveServiceTest
{
	@InjectMocks
	private LoveService sut;

	@Mock
	private ActionService mockedActionService;

	@Mock
	private AffectionRepository mockedAffectionRepository;

	@Mock
	private RelationshipRepository mockedRelationshipRepository;
}
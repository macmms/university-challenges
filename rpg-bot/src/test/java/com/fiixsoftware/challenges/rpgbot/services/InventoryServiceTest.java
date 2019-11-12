package com.fiixsoftware.challenges.rpgbot.services;

import com.fiixsoftware.challenges.rpgbot.persistence.repositories.GameEntityRepository;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class InventoryServiceTest
{
	@InjectMocks
	private InventoryService sut;

	@Mock
	private GameEntityRepository mockedGameEntityRepository;
}
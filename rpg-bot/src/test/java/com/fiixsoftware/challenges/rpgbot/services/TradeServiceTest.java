package com.fiixsoftware.challenges.rpgbot.services;

import com.fiixsoftware.challenges.rpgbot.persistence.repositories.TradeRepository;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class TradeServiceTest
{
	@InjectMocks
	private TradeService sut;

	@Mock
	private InventoryService mockedInventoryService;

	@Mock
	private TradeRepository mockedTradeRepository;
}
package com.fiixsoftware.challenges.rpgbot.services;

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
}
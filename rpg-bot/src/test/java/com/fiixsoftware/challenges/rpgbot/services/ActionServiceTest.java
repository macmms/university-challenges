package com.fiixsoftware.challenges.rpgbot.services;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class ActionServiceTest
{
	@InjectMocks
	private ActionService sut;

	@Mock
	private MapService mockedMapService;
}
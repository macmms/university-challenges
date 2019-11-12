package com.fiixsoftware.challenges.rpgbot.services;

import com.fiixsoftware.challenges.rpgbot.persistence.repositories.StatRepository;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class StatServiceTest
{
	@InjectMocks
	private StatService sut;

	@Mock
	private StatRepository mockedStatRepository;
}
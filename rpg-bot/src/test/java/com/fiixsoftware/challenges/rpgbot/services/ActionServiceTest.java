package com.fiixsoftware.challenges.rpgbot.services;

import com.fiixsoftware.challenges.rpgbot.persistence.repositories.ActionRepository;
import com.fiixsoftware.challenges.rpgbot.persistence.repositories.LocationRepository;
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

	@Mock
	private ActionRepository mockedActionRepository;

	@Mock
	private LocationRepository mockedLocationRepository;
}
package com.fiixsoftware.challenges.rpgbot.services;

import com.fiixsoftware.challenges.rpgbot.persistence.models.GameEntity;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Location;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The Map Service.
 * This is a stubbed service. Imagine it's real and fully implemented.
 */
@Service
public class MapService
{
	/**
	 * Find nearby entities list.
	 *
	 * @param location the location
	 * @param diameter the diameter
	 * @return the list
	 */
	public List<GameEntity> findNearbyEntities(Location location, int diameter)
	{
		return null;
	}
}

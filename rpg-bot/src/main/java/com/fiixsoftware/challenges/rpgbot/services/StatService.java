package com.fiixsoftware.challenges.rpgbot.services;

import com.fiixsoftware.challenges.rpgbot.persistence.models.GameEntity;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Stat;
import com.fiixsoftware.challenges.rpgbot.persistence.repositories.StatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The Stat Service.
 */
@Service
public class StatService
{
	@Autowired
	private StatRepository statRepository;

	/**
	 * Level up boolean.
	 *
	 * @param entity the entity
	 * @param statsToIncrease the stats to increase
	 * @return the boolean
	 */
	boolean LevelUp(GameEntity entity, List<Stat> statsToIncrease)
	{
		return false;
	}

	/**
	 * Check if requirements met by boolean.
	 *
	 * @param entity the entity
	 * @param statsToCompareAgainst the stats to compare against
	 * @return the boolean
	 */
	boolean CheckIfRequirementsMetBy(GameEntity entity, List<Stat> statsToCompareAgainst)
	{
		return false;
	}

	/**
	 * Add stats to boolean.
	 *
	 * @param entity the entity
	 * @param statsToAddToEntity the stats to add to entity
	 * @return the boolean
	 */
	boolean AddStatsTo(GameEntity entity, List<Stat> statsToAddToEntity)
	{
		return false;
	}

	/**
	 * Remove stats from boolean.
	 *
	 * @param entity the entity
	 * @param statsToRemoveFromEntity the stats to remove from entity
	 * @return the boolean
	 */
	boolean RemoveStatsFrom(GameEntity entity, List<Stat> statsToRemoveFromEntity)
	{
		return false;
	}
}

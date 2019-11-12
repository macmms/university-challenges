package com.fiixsoftware.challenges.rpgbot.services;

import com.fiixsoftware.challenges.rpgbot.persistence.models.Action;
import com.fiixsoftware.challenges.rpgbot.persistence.models.GameEntity;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Location;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Statement;
import com.fiixsoftware.challenges.rpgbot.persistence.models.types.GameEntityType;
import com.fiixsoftware.challenges.rpgbot.persistence.repositories.ActionRepository;
import com.fiixsoftware.challenges.rpgbot.persistence.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The Action Service.
 */
@Service
public class ActionService
{
	@Autowired
	private MapService mapService;

	@Autowired
	private ActionRepository actionRepository;

	@Autowired
	private LocationRepository locationRepository;

	/**
	 * Move to.
	 *
	 * @param location the location
	 * @return whether or not the movement was successful
	 */
	public boolean moveTo(Location location, GameEntity traveller)
	{
		return false;
	}

	/**
	 * Move to nearest entity of type entityType.
	 *
	 * @param gameEntityType the type of entity being moved toward
	 * @return whether or not the entity was found and the movement was successful
	 */
	public boolean moveToNearest(GameEntityType gameEntityType, GameEntity traveller)
	{
		return false;
	}

	/**
	 * Perform action on.
	 *
	 * @param entity the entity being acted on
	 * @param actionToPerform the action to perform
	 * @return whether or not the action was successful
	 */
	public boolean performActionOn(GameEntity entity, Action actionToPerform)
	{
		return false;
	}

	/**
	 * Say statement to entity.
	 *
	 * @param speaker the entity speaking
	 * @param recipient the entity being spoken to
	 * @param statementToSay the statement to say
	 * @return the statement spoken by the entity
	 */
	public Statement talkTo(GameEntity speaker, GameEntity recipient, Statement statementToSay)
	{
		return null;
	}

	/**
	 * Search for entities within a radius around a given location.
	 *
	 * @param location the location being searched around
	 * @return the list
	 */
	public List<GameEntity> searchRadiusOf(Location location)
	{
		return null;
	}
}

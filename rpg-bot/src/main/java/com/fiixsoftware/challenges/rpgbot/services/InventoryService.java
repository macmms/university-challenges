package com.fiixsoftware.challenges.rpgbot.services;

import com.fiixsoftware.challenges.rpgbot.models.GameEntity;
import org.springframework.stereotype.Service;

/**
 * The Inventory Service.
 */
@Service
public class InventoryService
{
	/**
	 * Put in inventory of boolean.
	 *
	 * @param entity the entity
	 * @param item the item
	 * @return the boolean
	 */
	boolean PutInInventoryOf(GameEntity entity, GameEntity item)
	{
		return false;
	}

	/**
	 * Remove from inventory of boolean.
	 *
	 * @param entity the entity
	 * @param item the item
	 * @return the boolean
	 */
	boolean RemoveFromInventoryOf(GameEntity entity, GameEntity item)
	{
		return false;
	}

	/**
	 * Equip to boolean.
	 *
	 * @param entity the entity
	 * @param equipment the equipment
	 * @return the boolean
	 */
	boolean EquipTo(GameEntity entity, GameEntity equipment)
	{
		return false;
	}

	/**
	 * Unequip from boolean.
	 *
	 * @param entity the entity
	 * @param equipment the equipment
	 * @return the boolean
	 */
	boolean UnequipFrom(GameEntity entity, GameEntity equipment)
	{
		return false;
	}

	/**
	 * Consume by boolean.
	 *
	 * @param entity the entity
	 * @param consumable the consumable
	 * @return the boolean
	 */
	boolean ConsumeBy(GameEntity entity, GameEntity consumable)
	{
		return false;
	}
}

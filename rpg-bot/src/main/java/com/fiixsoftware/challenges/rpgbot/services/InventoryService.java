package com.fiixsoftware.challenges.rpgbot.services;

import com.fiixsoftware.challenges.rpgbot.persistence.models.GameEntity;
import com.fiixsoftware.challenges.rpgbot.persistence.repositories.GameEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Inventory Service.
 */
@Service
public class InventoryService
{
	@Autowired
	private GameEntityRepository gameEntityRepository;

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
	 * Check if entity has item.
	 *
	 * @param item the item
	 * @param entityWhichMayHaveItem the entity which may have the item in question
	 * @return Whether or not the entity has the item
	 */
	boolean CheckIfEntityHas(GameEntity item, GameEntity entityWhichMayHaveItem)
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

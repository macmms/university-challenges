package com.fiixsoftware.challenges.rpgbot.services;

import com.fiixsoftware.challenges.rpgbot.models.GameEntity;
import com.fiixsoftware.challenges.rpgbot.models.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Trade Service.
 */
@Service
public class TradeService
{
	@Autowired
	private InventoryService inventoryService;

	/**
	 * Start trade between trade.
	 *
	 * @param initiator the initiator
	 * @param barterer the barterer
	 * @return the trade
	 */
	Trade StartTradeBetween(GameEntity initiator, GameEntity barterer)
	{
		return null;
	}

	/**
	 * End trade.
	 *
	 * @param trade the trade
	 * @param acceptTrade the accept trade
	 */
	void EndTrade(Trade trade, boolean acceptTrade)
	{
	}

	/**
	 * Offer item in boolean.
	 *
	 * @param trade the trade
	 * @param item the item
	 * @return the boolean
	 */
	boolean OfferItemIn(Trade trade, GameEntity item)
	{
		return false;
	}

	/**
	 * Request item in boolean.
	 *
	 * @param trade the trade
	 * @param item the item
	 * @return the boolean
	 */
	boolean RequestItemIn(Trade trade, GameEntity item)
	{
		return false;
	}

	/**
	 * Remove offer from boolean.
	 *
	 * @param trade the trade
	 * @param item the item
	 * @return the boolean
	 */
	boolean RemoveOfferFrom(Trade trade, GameEntity item)
	{
		return false;
	}

	/**
	 * Remove request from boolean.
	 *
	 * @param trade the trade
	 * @param item the item
	 * @return the boolean
	 */
	boolean RemoveRequestFrom(Trade trade, GameEntity item)
	{
		return false;
	}
}

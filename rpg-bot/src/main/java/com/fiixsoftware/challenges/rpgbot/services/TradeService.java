package com.fiixsoftware.challenges.rpgbot.services;

import com.fiixsoftware.challenges.rpgbot.persistence.models.GameEntity;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Trade;
import com.fiixsoftware.challenges.rpgbot.persistence.repositories.GameEntityRepository;
import com.fiixsoftware.challenges.rpgbot.persistence.repositories.TradeRepository;
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

	@Autowired
	private TradeRepository tradeRepository;

	@Autowired
	private GameEntityRepository gameEntityRepository;

	/**
	 * Start trade between trade.
	 *
	 * @param initiator the initiator
	 * @param barterer the barterer
	 * @return the trade
	 */
	public Trade StartTradeBetween(GameEntity initiator, GameEntity barterer)
	{
		return null;
	}

	/**
	 * End trade.
	 *
	 * @param trade the trade
	 * @param acceptTrade whether or not the trade is ending with an acceptance
	 */
	public void EndTrade(Trade trade, boolean acceptTrade)
	{
	}

	/**
	 * Offer item in boolean.
	 *
	 * @param trade the trade
	 * @param item the item
	 * @return the boolean
	 */
	public boolean OfferItemIn(Trade trade, GameEntity item)
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
	public boolean RequestItemIn(Trade trade, GameEntity item)
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
	public boolean RemoveOfferFrom(Trade trade, GameEntity item)
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
	public boolean RemoveRequestFrom(Trade trade, GameEntity item)
	{
		return false;
	}
}

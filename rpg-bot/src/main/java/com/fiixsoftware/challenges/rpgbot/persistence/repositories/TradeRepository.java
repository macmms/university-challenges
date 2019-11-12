package com.fiixsoftware.challenges.rpgbot.persistence.repositories;

import com.fiixsoftware.challenges.rpgbot.persistence.models.GameEntity;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Trade;
import org.springframework.data.repository.CrudRepository;

public interface TradeRepository extends CrudRepository<Trade, Long>
{
	Trade findById(long id);

	Trade findByInitiatorAndBarterer(GameEntity initiator, GameEntity barterer);
}

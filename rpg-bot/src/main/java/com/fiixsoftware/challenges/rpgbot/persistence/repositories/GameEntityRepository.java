package com.fiixsoftware.challenges.rpgbot.persistence.repositories;

import com.fiixsoftware.challenges.rpgbot.persistence.models.GameEntity;
import org.springframework.data.repository.CrudRepository;

public interface GameEntityRepository extends CrudRepository<GameEntity, Long>
{
	GameEntity findById(long id);

	GameEntity findByName(String name);
}

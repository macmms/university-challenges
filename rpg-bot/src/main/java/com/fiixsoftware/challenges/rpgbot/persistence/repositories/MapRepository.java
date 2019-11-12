package com.fiixsoftware.challenges.rpgbot.persistence.repositories;

import com.fiixsoftware.challenges.rpgbot.persistence.models.GameEntity;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Map;
import org.springframework.data.repository.CrudRepository;

public interface MapRepository extends CrudRepository<Map, Long>
{
	Map findById(long id);

	Map findByName(String name);
}

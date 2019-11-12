package com.fiixsoftware.challenges.rpgbot.persistence.repositories;

import com.fiixsoftware.challenges.rpgbot.persistence.models.GameEntity;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Stat;
import com.fiixsoftware.challenges.rpgbot.persistence.models.types.StatType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StatRepository extends CrudRepository<Stat, Long>
{
	Stat findById(long id);

	List<Stat> findAllByGameEntity(GameEntity entityWithStats);

	Stat findByGameEntityAndStatType(GameEntity entityWithStats, StatType typeOfStat);
}

package com.fiixsoftware.challenges.rpgbot.persistence.repositories;

import com.fiixsoftware.challenges.rpgbot.persistence.models.Affection;
import com.fiixsoftware.challenges.rpgbot.persistence.models.GameEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AffectionRepository extends CrudRepository<Affection, Long>
{
	Affection findById(long id);

	List<Affection> findByEntityWithAffection(GameEntity entityWithAffection);
}

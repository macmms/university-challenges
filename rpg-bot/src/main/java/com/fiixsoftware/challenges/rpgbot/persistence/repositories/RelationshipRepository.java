package com.fiixsoftware.challenges.rpgbot.persistence.repositories;

import com.fiixsoftware.challenges.rpgbot.persistence.models.GameEntity;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Relationship;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RelationshipRepository extends CrudRepository<Relationship, Long>
{
	Relationship findById(long id);
}

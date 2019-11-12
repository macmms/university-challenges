package com.fiixsoftware.challenges.rpgbot.persistence.repositories;

import com.fiixsoftware.challenges.rpgbot.persistence.models.Coordinate;
import org.springframework.data.repository.CrudRepository;

public interface CoordinateRepository extends CrudRepository<Coordinate, Long>
{
	Coordinate findById(long id);
}

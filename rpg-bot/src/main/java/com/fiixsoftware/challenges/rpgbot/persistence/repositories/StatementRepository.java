package com.fiixsoftware.challenges.rpgbot.persistence.repositories;

import com.fiixsoftware.challenges.rpgbot.persistence.models.Location;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Statement;
import org.springframework.data.repository.CrudRepository;

public interface StatementRepository extends CrudRepository<Statement, Long>
{
	Statement findById(long id);
}

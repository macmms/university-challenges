package com.fiixsoftware.challenges.rpgbot.persistence.repositories;

import com.fiixsoftware.challenges.rpgbot.persistence.models.Action;
import com.fiixsoftware.challenges.rpgbot.persistence.models.types.ActionType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActionRepository extends CrudRepository<Action, Long>
{
	Action findById(long id);

	List<Action> findByActionType(ActionType typeOfAction);
}

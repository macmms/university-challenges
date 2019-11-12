package com.fiixsoftware.challenges.rpgbot.services;

import com.fiixsoftware.challenges.rpgbot.persistence.models.Action;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Affection;
import com.fiixsoftware.challenges.rpgbot.persistence.models.GameEntity;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Statement;
import com.fiixsoftware.challenges.rpgbot.persistence.repositories.AffectionRepository;
import com.fiixsoftware.challenges.rpgbot.persistence.repositories.RelationshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Love Service.
 */
@Service
public class LoveService
{
	@Autowired
	private ActionService actionService;

	@Autowired
	private AffectionRepository affectionRepository;

	@Autowired
	private RelationshipRepository relationshipRepository;

	/**
	 * Flirt with affection.
	 *
	 * @param provider the provider
	 * @param recipient the recipient
	 * @param flirtyStatement the flirty statement
	 * @return the affection
	 */
	Affection FlirtWith(GameEntity provider, GameEntity recipient, Statement flirtyStatement)
	{
		return null;
	}

	/**
	 * Give gift to affection.
	 *
	 * @param provider the provider
	 * @param recipient the recipient
	 * @param gift the gift
	 * @return the affection
	 */
	Affection GiveGiftTo(GameEntity provider, GameEntity recipient, GameEntity gift)
	{
		return null;
	}

	/**
	 * Show physical affection to affection.
	 *
	 * @param provider the provider
	 * @param recipient the recipient
	 * @param action the action
	 * @return the affection
	 */
	Affection ShowPhysicalAffectionTo(GameEntity provider, GameEntity recipient, Action action)
	{
		return null;
	}

	/**
	 * Enter relationship with boolean.
	 *
	 * @param initiator the initiator
	 * @param target the target
	 * @return the boolean
	 */
	boolean EnterRelationshipWith(GameEntity initiator, GameEntity target)
	{
		return false;
	}

	/**
	 * Break up with boolean.
	 *
	 * @param heartbreaker the heartbreaker
	 * @param heartbroken the heartbroken
	 * @return the boolean
	 */
	boolean BreakUpWith(GameEntity heartbreaker, GameEntity heartbroken)
	{
		return false;
	}
}

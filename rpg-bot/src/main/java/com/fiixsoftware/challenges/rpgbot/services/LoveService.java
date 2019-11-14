package com.fiixsoftware.challenges.rpgbot.services;

import com.fiixsoftware.challenges.rpgbot.persistence.models.Action;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Affection;
import com.fiixsoftware.challenges.rpgbot.persistence.models.GameEntity;
import com.fiixsoftware.challenges.rpgbot.persistence.models.Statement;
import com.fiixsoftware.challenges.rpgbot.persistence.models.types.GameEntityType;
import com.fiixsoftware.challenges.rpgbot.persistence.models.types.StatementType;
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
	 * Flirt with an NPC using a flirtatious statement.
	 *
	 * @param provider the provider
	 * @param recipient the recipient
	 * @param flirtyStatement the flirty statement
	 * @return the affection
	 */
	public Affection flirtWith(GameEntity provider, GameEntity recipient, Statement flirtyStatement)
	{
		if (recipient.getGameEntityType() != GameEntityType.NPC)
		{
			return null;
		}

		Affection affectionForProvider = null;
		for (Affection affection : recipient.getAffections())
		{
			if (affection.getEntityAffectionIsToward().equals(provider))
			{
				affectionForProvider = affection;
			}
		}

		if (affectionForProvider == null)
		{
			affectionForProvider = new Affection(recipient, provider);
		}

		// Note:
		// Flirting does not always result in increased affection in real life.
		// Please do not make unwanted moves toward others, and respect when people say no.
		if (flirtyStatement.getStatementType() == StatementType.FLIRT)
		{
			affectionForProvider.setAmountOfAffection(Math.min(affectionForProvider.getAmountOfAffection() + 5L, Affection.MAXIMUM_AFFECTION));
		}
		else
		{
			affectionForProvider.setAmountOfAffection(Math.max(affectionForProvider.getAmountOfAffection() - 5L, Affection.MINIMUM_AFFECTION));
		}

		affectionRepository.save(affectionForProvider);
		return affectionForProvider;
	}

	/**
	 * Give a gift to an NPC.
	 *
	 * @param provider the provider
	 * @param recipient the recipient
	 * @param gift the gift
	 * @return the affection
	 */
	public Affection giveGiftTo(GameEntity provider, GameEntity recipient, GameEntity gift)
	{
		return null;
	}

	/**
	 * Show physical affection to an NPC.
	 *
	 * @param provider the provider
	 * @param recipient the recipient
	 * @param action the action
	 * @return the affection
	 */
	public Affection showPhysicalAffectionTo(GameEntity provider, GameEntity recipient, Action action)
	{
		return null;
	}

	/**
	 * Enter a relationship with an NPC.
	 *
	 * @param initiator the initiator
	 * @param target the target
	 * @return the boolean
	 */
	public boolean enterRelationshipWith(GameEntity initiator, GameEntity target)
	{
		return false;
	}

	/**
	 * Break up an existing relationship with an NPC.
	 *
	 * @param heartbreaker the heartbreaker
	 * @param heartbroken the heartbroken
	 * @return the boolean
	 */
	public boolean breakUpWith(GameEntity heartbreaker, GameEntity heartbroken)
	{
		return false;
	}
}

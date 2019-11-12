package com.fiixsoftware.challenges.rpgbot.models;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Relationship
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne(cascade = CascadeType.ALL)
	private GameEntity relationshipMemberA;

	@ManyToOne(cascade = CascadeType.ALL)
	private GameEntity relationshipMemberB;
}

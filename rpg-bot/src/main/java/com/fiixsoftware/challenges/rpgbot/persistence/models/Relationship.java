package com.fiixsoftware.challenges.rpgbot.persistence.models;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
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

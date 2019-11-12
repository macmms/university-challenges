package com.fiixsoftware.challenges.rpgbot.models;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Affection
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne(cascade = CascadeType.ALL)
	private GameEntity gameEntity;

	@ManyToOne(cascade = CascadeType.ALL)
	private GameEntity entityAffectionIsToward;

	@Column(nullable = false)
	private int amountOfAffection;
}

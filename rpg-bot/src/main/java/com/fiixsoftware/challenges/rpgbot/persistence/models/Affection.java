package com.fiixsoftware.challenges.rpgbot.persistence.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
@NoArgsConstructor
public class Affection
{
	@JsonIgnore
	public static final long MINIMUM_AFFECTION = 0L;

	@JsonIgnore
	public static final long STARTING_AFFECTION = 50L;

	@JsonIgnore
	public static final long MAXIMUM_AFFECTION = 100L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne(cascade = CascadeType.ALL)
	private GameEntity entityWithAffection;

	@ManyToOne(cascade = CascadeType.ALL)
	private GameEntity entityAffectionIsToward;

	@Column(nullable = false)
	private long amountOfAffection;

	@JsonIgnore
	public Affection(GameEntity entityWithAffection, GameEntity entityAffectionIsToward)
	{
		this.entityWithAffection = entityWithAffection;
		this.entityAffectionIsToward = entityAffectionIsToward;
		this.amountOfAffection = STARTING_AFFECTION;
	}
}

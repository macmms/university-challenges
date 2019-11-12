package com.fiixsoftware.challenges.rpgbot.persistence.models;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Trade
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne(cascade = CascadeType.ALL)
	private GameEntity initiator;

	@ManyToOne(cascade = CascadeType.ALL)
	private GameEntity barterer;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<GameEntity> offers;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<GameEntity> requests;
}

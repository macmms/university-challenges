package com.fiixsoftware.challenges.rpgbot.persistence.models;

import com.fiixsoftware.challenges.rpgbot.persistence.models.types.StatType;
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
public class Stat
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne(cascade = CascadeType.ALL)
	private GameEntity gameEntity;

	@Column(nullable = false)
	private StatType statType;

	@Column(nullable = false)
	private long value;
}

package com.fiixsoftware.challenges.rpgbot.persistence.models;

import com.fiixsoftware.challenges.rpgbot.persistence.models.types.ActionType;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Action
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(nullable = false)
	private ActionType actionType;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Stat> statRequirements;

	@Column
	private long power;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Stat> statMultiplier;
}

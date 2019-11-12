package com.fiixsoftware.challenges.rpgbot.persistence.models;

import com.fiixsoftware.challenges.rpgbot.persistence.models.types.GameEntityType;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class GameEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Stat> stats;

	@Column(nullable = false, unique = true)
	private String name;

	@Column(nullable = false)
	private GameEntityType gameEntityType;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Affection> affections = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<GameEntity> inventory = new ArrayList<>();
}

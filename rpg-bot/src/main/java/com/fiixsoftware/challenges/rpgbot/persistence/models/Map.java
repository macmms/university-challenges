package com.fiixsoftware.challenges.rpgbot.persistence.models;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Map
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(nullable = false, unique = true)
	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Map> connectingMaps = new ArrayList<>();

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Map> connectedMaps = new ArrayList<>();
}

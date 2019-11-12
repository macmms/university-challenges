package com.fiixsoftware.challenges.rpgbot.models.types;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum GameEntityType
{
	NPC("npc"),
	ENEMY("enemy"),
	DOOR("door"),
	ITEM("item"),
	CONSUMABLE("consumable"),
	EQUIPMENT("equipment"),
	CHEST("chest"),
	MOUNT("mount"),
	OBSTACLE("obstacle");

	private String value;
}

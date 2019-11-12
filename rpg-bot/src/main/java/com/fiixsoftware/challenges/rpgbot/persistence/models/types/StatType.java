package com.fiixsoftware.challenges.rpgbot.persistence.models.types;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum StatType
{
	MAX_HEALTH("maximum health"),
	HEALTH("health"),
	MAX_MANA("maximum mana"),
	MANA("mana"),
	CONSTITUTION("constitution"),
	DEXTERITY("dexterity"),
	STRENGTH("strength"),
	WISDOM("wisdom"),
	INTELLIGENCE("intelligence"),
	CHARISMA("charisma"),
	MONETARY_VALUE("monetary value"),
	AFFECTION("affection");

	private String value;
}

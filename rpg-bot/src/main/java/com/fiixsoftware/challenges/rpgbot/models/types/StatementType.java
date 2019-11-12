package com.fiixsoftware.challenges.rpgbot.models.types;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum StatementType
{
	GREET("greet"),
	INSULT("insult"),
	FLIRT("flirt"),
	INQUIRE("inquire"),
	ACCEPT("accept"),
	REJECT("reject"),
	OFFER("offer"),
	DEBATE("debate");

	private String value;
}

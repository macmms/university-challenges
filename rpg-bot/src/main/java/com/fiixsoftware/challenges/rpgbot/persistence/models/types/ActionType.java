package com.fiixsoftware.challenges.rpgbot.persistence.models.types;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ActionType
{
	ATTACK("attack"),
	PROTECT("protect"),
	CAST("cast"),
	PICK_UP("pick up"),
	DROP("drop"),
	TRADE("trade"),
	GIFT("gift"),
	LEARN("learn"),
	FORGET("forget"),
	TRAVEL("travel"),
	REST("rest"),
	HUG("hug"),
	CUDDLE("cuddle");

	private String value;
}

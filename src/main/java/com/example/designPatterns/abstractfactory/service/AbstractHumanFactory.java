package com.example.designPatterns.abstractfactory.service;

public interface AbstractHumanFactory {

	public AHuman createWhiteHuman();
	
	public AHuman createYellowHuman();
	
	public AHuman createBlackHuman();
	
}

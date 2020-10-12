package com.example.designPatterns.abstractfactory;

public interface AbstractHumanFactory {

	public AHuman createWhiteHuman();
	
	public AHuman createYellowHuman();
	
	public AHuman createBlackHuman();
	
}

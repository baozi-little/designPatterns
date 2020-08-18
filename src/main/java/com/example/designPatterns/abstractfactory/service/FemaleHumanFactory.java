package com.example.designPatterns.abstractfactory.service;

public class FemaleHumanFactory implements AbstractHumanFactory {

	@Override
	public AHuman createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

	@Override
	public AHuman createYellowHuman() {
		return new FemaleYellowHuman();
	}

	@Override
	public AHuman createBlackHuman() {
		return new FemaleBlackHuman();
	}

}

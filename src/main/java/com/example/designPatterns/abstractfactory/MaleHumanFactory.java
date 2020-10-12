package com.example.designPatterns.abstractfactory;

public class MaleHumanFactory implements AbstractHumanFactory {

	@Override
	public AHuman createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	@Override
	public AHuman createYellowHuman() {
		return new MaleYellowHuman();
	}

	@Override
	public AHuman createBlackHuman() {
		return new MaleBlackHuman();
	}

	

}

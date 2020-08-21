package com.example.designPatterns.builder;

import java.util.ArrayList;

public class Director implements IDirector {

	ArrayList<String> sequence = new ArrayList<String>();

	@Override
	public CarModel getABenzModel() {
		// start -> alarm -> stop
		sequence.clear();
		sequence.add("start");
		sequence.add("alarm");
		sequence.add("stop");
		
		BenzBuilder benzBuilder = new BenzBuilder();
		benzBuilder.setSequence(sequence);
		CarModel banzModel = benzBuilder.getModel();
		return banzModel;
	}

	@Override
	public CarModel getBBenzModel() {
		// start -> engineBoom -> stop
		sequence.clear();
		sequence.add("start");
		sequence.add("engineBoom");
		sequence.add("stop");

		BenzBuilder benzBuilder = new BenzBuilder();
		benzBuilder.setSequence(sequence);
		CarModel banzModel = benzBuilder.getModel();
		return banzModel;
	}

	@Override
	public CarModel getABMWModel() {
		// start -> alarm -> engineBoom -> stop
		sequence.clear();
		sequence.add("start");
		sequence.add("alarm");
		sequence.add("engineBoom");
		sequence.add("stop");

		BMWBuilder bmwBuilder = new BMWBuilder();
		bmwBuilder.setSequence(sequence);
		CarModel bmwModel = bmwBuilder.getModel();
		return bmwModel;
	}

}

package com.example.designPatterns.builder;

import java.util.ArrayList;

public class BMWBuilder implements CarBuilder {

	BMWModel bmwModel = new BMWModel();

	@Override
	public void setSequence(ArrayList<String> sequence) {

		bmwModel.setSequence(sequence);
	}

	@Override
	public CarModel getModel() {
		return bmwModel;
	}


}

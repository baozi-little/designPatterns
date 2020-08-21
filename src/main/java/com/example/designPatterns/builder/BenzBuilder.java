package com.example.designPatterns.builder;

import java.util.ArrayList;

public class BenzBuilder implements CarBuilder {
	
	BenzModel benzModel = new BenzModel();	

	@Override
	public void setSequence(ArrayList<String> sequence) {
		
		benzModel.setSequence(sequence);
	}

	@Override
	public CarModel getModel() {
		return benzModel;
	}


}

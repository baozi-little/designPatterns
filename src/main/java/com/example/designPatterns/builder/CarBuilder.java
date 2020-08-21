package com.example.designPatterns.builder;

import java.util.ArrayList;

public interface CarBuilder {
	
	public void setSequence(ArrayList<String> sequence);
	
	public CarModel getModel();

}

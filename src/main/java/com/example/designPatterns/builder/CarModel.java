package com.example.designPatterns.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {

	List<String> sequence = new ArrayList<String>();
	
	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();
	
	protected void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}

	public final void run() {
		
		for (String functionName : sequence) {
			if ("start".equals(functionName)) {
				this.start();
			}else if ("stop".equals(functionName)) {
				this.stop();
			}else if ("alarm".equals(functionName)) {
				this.alarm();
			}else {
				this.engineBoom();
			}
		}

		
	}

}

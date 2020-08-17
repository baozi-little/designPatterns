package com.example.designPatterns.singleton.lazy.model;

public class Emperor {

	private Emperor() {
		super();
	}

	private static Emperor emperor;
	
	public static Emperor getInstance() {
		
		if (emperor == null) {
			emperor = new Emperor();
		}
		
		return emperor;
	}
	
	public void say() {
		System.out.println("I'm emperor !");
	}
}

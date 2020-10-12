package com.example.designPatterns.singleton;

public class Emperor {

	private static Emperor emperor = new Emperor();

	private Emperor() {
		super();
	}
	
	public static Emperor getInstance() {
		
		return emperor;
	}
	
	public void say() {
		System.out.println("I'm emperor !");
	}
}

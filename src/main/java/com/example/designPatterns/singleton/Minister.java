package com.example.designPatterns.singleton;

public class Minister implements IMinister {

	public Minister() {
		super();
	}

	Emperor emperor;
	
	@Override
	public void meeting() {
		
		for (int i = 0; i < 3; i++) {
			emperor = Emperor.getInstance();
			emperor.say();
			
		}
	}
}

package com.example.designPatterns.abstractfactory.service;

public abstract class BlackHuman implements AHuman {

	@Override
	public void getColor() {
		System.out.println("黑种人的皮肤是黑色的。");
	}
	
	@Override
	public void talk() {
		System.out.println("黑色人种说话一般人听不懂。");
	}
}

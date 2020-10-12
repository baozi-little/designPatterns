package com.example.designPatterns.factory;

public class BlackHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("黑人的皮肤是黑色的。");
	}

	@Override
	public void talk() {
		System.out.println("黑人说的话一般人听不懂。");
	}

}

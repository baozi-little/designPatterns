package com.example.designPatterns.factory.service;

public class YellowHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("黄种人的皮肤是黄色的。");
	}

	@Override
	public void talk() {
		System.out.println("黄种人说的话一般是双字节。");
	}

}

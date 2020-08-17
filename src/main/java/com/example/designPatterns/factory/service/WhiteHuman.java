package com.example.designPatterns.factory.service;

public class WhiteHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("白人的皮肤是白色的。");
	}

	@Override
	public void talk() {
		System.out.println("白人说的话一般是单字节。");
	}

}

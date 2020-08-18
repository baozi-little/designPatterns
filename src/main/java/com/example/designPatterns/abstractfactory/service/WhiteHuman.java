package com.example.designPatterns.abstractfactory.service;

public abstract class WhiteHuman implements AHuman {

	@Override
	public void getColor() {
		System.out.println("白种人的皮肤是白色的。");
	}
	
	@Override
	public void talk() {
		System.out.println("白色人种说话一般都是单字节。");
	}
}

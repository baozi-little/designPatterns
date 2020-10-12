package com.example.designPatterns.abstractfactory;

public abstract class YellowHuman implements AHuman {

	@Override
	public void getColor() {
		System.out.println("黄种人的皮肤是黄色的。");
	}
	
	@Override
	public void talk() {
		System.out.println("黄色人种说话一般都是双字节。");
	}
}

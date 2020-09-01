package com.example.designPatterns.strategy;

/**
 * 锦囊
 * @author HL_Yin
 *
 */
public class Context {

	private IStrategy iStrategy;

	public Context(IStrategy iStrategy) {
		this.iStrategy = iStrategy;
	}
	
	public void operate() {
		this.iStrategy.operate();
	}
	
}

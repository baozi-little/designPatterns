package com.example.designPatterns.bridge;

/**
 * IPad类
 * @author HL_Yin
 *
 */
public class IPad extends Product{

	@Override
	public void beProducted() {
		System. out. println(" 生 产出 的 iPod 是 这样 的...");

	}

	@Override
	public void beSelled() {
		System. out. println(" 生 产出 的 iPod 卖出 去了...");

	}

}

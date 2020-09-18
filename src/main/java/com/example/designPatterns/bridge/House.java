package com.example.designPatterns.bridge;

/**
 * 房子类
 * @author HL_Yin
 *
 */
public class House extends Product {

	// 豆腐 渣 就 豆腐 渣 呗， 好歹 也是 房子
	public void beProducted() {
		System.out.println(" 生 产出 的 房子 是 这样 的...");
	}

	// 虽然 是 豆腐 渣， 也是 能够 销售 出去 的
	public void beSelled() {
		System.out.println(" 生 产出 的 房子 卖出 去了...");
	}

}

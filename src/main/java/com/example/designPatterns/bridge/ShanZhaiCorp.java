package com.example.designPatterns.bridge;

/**
 * 山寨公司类
 * 
 * @author HL_Yin
 *
 */
public class ShanZhaiCorp extends Corp {

	// 产 什么 产品， 不知道， 等 被 调 用的 才 知道
	public ShanZhaiCorp(Product product) {
		super(product);
	}

	// 狂 赚钱
	public void makeMoney() {
		super.makeMoney();
		System.out.println(" 我 赚钱 呀...");
	}

}

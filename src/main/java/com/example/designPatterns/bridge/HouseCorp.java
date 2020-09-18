package com.example.designPatterns.bridge;

/**
 * 房产公司类
 * 
 * @author HL_Yin
 *
 */
public class HouseCorp extends Corp {

	// 定义 传递 一个 House 产品 进来
	public HouseCorp(House house) {
		super(house);
	}

	// 房地产 公司 很 High 了， 赚钱， 计算 利润
	public void makeMoney() {
		super.makeMoney();
		System.out.println(" 房地产 公司 赚 大钱 了...");
	}

}

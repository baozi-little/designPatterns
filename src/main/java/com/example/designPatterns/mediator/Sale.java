package com.example.designPatterns.mediator;

import java.util.Random;

public class Sale extends AbstractColleague {

	// 销售类
	public Sale(AbstractMediator mediator) {
		super(mediator);
	}

	// 销售电脑
	public void sellComputer(int number) {
		super.mediator.execute("sale.sell", number);
		System.out.println("销售电脑：" + number + "台");
	}
	
	//反馈 销售 情况， 0 ～ 100 变化， 0 代表 根本 就 没人 买， 100 代表 非常 畅销， 出 一个 卖 一个
	public int getSellStatus() {
		Random random = new Random(System.currentTimeMillis());
	 	int status = random.nextInt(100);
	 	System.out.println("电脑销售情况为：" + status);
	 	return status;
	}
	
	// 折扣处理
	public void offSale() {	
		super.mediator.execute("sale.off");
	}
}

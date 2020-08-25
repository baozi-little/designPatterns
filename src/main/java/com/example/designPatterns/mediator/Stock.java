package com.example.designPatterns.mediator;

public class Stock extends AbstractColleague {

	// 仓库类
	public Stock(AbstractMediator mediator) {
		super(mediator);
	}
	
	// 刚开始有100台电脑
	private static int COMPUTER_NUMBER = 100;

	// 库存增加
	public void increase(int number) {
		COMPUTER_NUMBER += number;
		System.out.println("库存数量为：" + COMPUTER_NUMBER);
	}
	
	// 库存减少
	public void decrease(int number) {
		COMPUTER_NUMBER -= number;
		System.out.println("库存数量为：" + COMPUTER_NUMBER);
	}
	
	// 获取库存数量
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}
	
	// 清空库存
	public void clearStock() {
		System.out.println("需要清理库存数量为：" + COMPUTER_NUMBER);
		super.mediator.execute("stock.clear");
	}
}

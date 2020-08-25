package com.example.designPatterns.mediator;

public class Purchase extends AbstractColleague {

	// 采购类
	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}
	
	// 采购电脑
	public void buyComputer(int number) {
		super.mediator.execute("purchase.buy", number);
	}
	
	// 不再采购电脑
	public void refuseBuyComputer() {
		System.out.println("不再采购电脑。");
	}

}

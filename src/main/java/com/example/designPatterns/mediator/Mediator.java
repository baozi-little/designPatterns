package com.example.designPatterns.mediator;

/**
 * 中介者具体类
 * @author HL_Yin
 *
 */
public class Mediator extends AbstractMediator {

	@Override
	public void execute(String string, Object... objects) {
		
		if ("purchase.buy".equals(string)) {
			// 采购电脑
			this.buyComputer((int)objects[0]);
		}else if ("sale.sell".equals(string)) {
			// 销售电脑
			this.sellComputer((int)objects[0]);
		}else if ("sale.off".equals(string)) {
			// 打折销售
			this.offSale();
		}else {
			// 清空仓库
			this.clearStock();
		}
	}
	
	// 采购电脑
	private void buyComputer(int number) {
		int saleStatus = super.sale.getSellStatus();
		if (saleStatus > 80) {
			// 销售情况良好，要多少买多少
			System.out.println("采购电脑：" + number + "台");
			// 结果就是仓库的储备增加了
			stock.increase(number);
		}else {
			// 销售情况不乐观，折半采购
			System.out.println("采购电脑：" + number/2 + "台");
			// 结果就是仓库的储备增加了
			stock.increase(number/2);
		}
	}
	
	// 销售电脑
	private void sellComputer(int number) {
		if (super.stock.getStockNumber() < number) {
			// 如果仓库存储不足，采购
			super.purchase.buyComputer(number);
		}
		// 结果就是仓库的储备减少了
		stock.decrease(number);
	}
	
	// 折价销售
	private void offSale() {
		System.out.println("折价销售电脑" + super.stock.getStockNumber() + "台");
	}

	// 清仓
	private void clearStock() {
		// 要求清仓销售，打折
		super.sale.offSale();
		// 要求采购人员停止采购
		super.purchase.refuseBuyComputer();
	}
}

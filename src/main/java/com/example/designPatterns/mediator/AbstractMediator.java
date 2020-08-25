package com.example.designPatterns.mediator;

/**
 * 中介者抽象类
 * @author HL_Yin
 *
 */
public abstract class AbstractMediator {

	protected Purchase purchase;

	protected Sale sale;

	protected Stock stock;

	public AbstractMediator() {
		
		purchase = new Purchase(this);
		
		sale = new Sale(this);
		
		stock = new Stock(this);
		
	}

	public abstract void execute(String string, Object... objects);

}

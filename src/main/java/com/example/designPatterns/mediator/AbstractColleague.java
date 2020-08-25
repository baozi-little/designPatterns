package com.example.designPatterns.mediator;

public abstract class AbstractColleague {

	AbstractMediator mediator = null;

	// 抽象出同事类，是因为每个同事都需要调用中介类，具体的事由中介来做
	public AbstractColleague(AbstractMediator mediator) {
		super();
		this.mediator = mediator;
	}
	
	
}

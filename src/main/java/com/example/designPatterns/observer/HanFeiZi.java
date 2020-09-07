package com.example.designPatterns.observer;

import java.util.ArrayList;

/**
 * 韩非子 类（被观察者类）
 * @author HL_Yin
 *
 */
public class HanFeiZi implements IHanFeiZi,Observable {
	
	//定义 个 变长 数组， 存放 所有 的 观察者 
	private ArrayList< Observer> observerList = new ArrayList< Observer>();

	@Override
	public void addObserver(Observer observer) {

		observerList.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {

		observerList.remove(observer);
	}

	@Override
	public void notifyObservers(String context) {

		for (Observer observer : observerList) {
			observer.update(context);
		}
	}

	@Override
	public void haveBreakfast() {

		String context = "韩非子在吃早饭。。。";
		System.out.println(context);
		this.notifyObservers(context);
	}

	@Override
	public void haveFun() {
		String context = "韩非子在娱乐。。。";
		System.out.println(context);
		this.notifyObservers(context);
	}

}

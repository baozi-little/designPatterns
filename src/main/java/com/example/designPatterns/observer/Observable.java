package com.example.designPatterns.observer;

/**
 * 被观察者的统一接口
 * 
 * @author HL_Yin
 *
 */
public interface Observable {

	// 添加一个观察者
	public void addObserver(Observer observer);

	// 删除一个观察者
	public void deleteObserver(Observer observer);

	// 通知观察者
	public void notifyObservers(String context);

}

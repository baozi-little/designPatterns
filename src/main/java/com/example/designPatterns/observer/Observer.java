package com.example.designPatterns.observer;

/**
 * 观察者接口
 * @author HL_Yin
 *
 */
public interface Observer {

	//一发 现 别人 有 动静， 自己 也要 行动 起来 
	public void update( String context);

}

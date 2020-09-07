package com.example.designPatterns.observer;

/**
 * 其他观察者类
 * @author HL_Yin
 *
 */
public class Other implements Observer {

	@Override
	public void update(String context) {

		System.out.println("观察者2号报告老板：" + context);
	}

}

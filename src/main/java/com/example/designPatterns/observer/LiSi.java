package com.example.designPatterns.observer;

/**
 * 李斯 类（观察者类）
 * @author HL_Yin
 *
 */
public class LiSi implements Observer {

	@Override
	public void update(String context) {

		System.out.println("李斯报告秦始皇：" + context);
	}

}

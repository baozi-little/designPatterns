package com.example.designPatterns.resopnsibilitychain;

/**
 * 默认责任链
 * @author HL_Yin
 *
 */
public class DefaultChain {

	Father father = new Father();
	
	Husband husband = new Husband();
	
	Son son = new Son();
	
	public  void handle(IWomen women) {
		// 设置责任链顺序
		father.setNexHandler(husband);
		husband.setNexHandler(son);
		// 先询问父亲
		father.handleMessage(women);
	}
}

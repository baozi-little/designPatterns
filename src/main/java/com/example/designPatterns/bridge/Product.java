package com.example.designPatterns.bridge;

/**
 * 抽象产品类
 * @author HL_Yin
 *
 */
public abstract class Product {

	//甭管 是什么 产品 它 总要 能被 生产 出来 
	public abstract void beProducted(); 
	//生产 出来 的 东西， 一定 要 销售 出去， 否则 亏本 
	public abstract void beSelled();

}

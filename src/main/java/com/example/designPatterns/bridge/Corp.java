package com.example.designPatterns.bridge;

/**
 * 公司抽象类
 * 
 * @author HL_Yin
 *
 */
public abstract class Corp {

	// 定义 一个 抽象 的 产品 对象， 不知道 具体 是什么 产品
	private Product product;

	// 构造 函数， 由 子类 定义 传递 具体 的 产品 进来
	public Corp(Product product) {
		this.product = product;
	}

	// 公司 是 干什么 的？ 赚钱 的！
	public void makeMoney() {
		// 每家 公司 都是 一样， 先 生产
		this.product.beProducted();
		// 然后 销售
		this.product.beSelled();
	}

}

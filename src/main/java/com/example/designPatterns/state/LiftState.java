package com.example.designPatterns.state;

/**
 * 电梯状态抽象类
 * 
 * @author HL_Yin
 *
 */
public abstract class LiftState {

	// 定义 一个 环境 角色， 也就是 封装 状态 的 变化 引起 的 功能 变化
	protected Lift lift;

	public void setLift(Lift lift) {
		this.lift = lift;
	}

	// 首先 电梯 门开 启动 作
	public abstract void open();

	// 电梯 门 有 开启， 那 当然 也就 有 关闭 了
	public abstract void close();

	// 电梯 要 能上能下， 运行 起来
	public abstract void run();

	// 电梯 还要 能 停下来
	public abstract void stop();

}

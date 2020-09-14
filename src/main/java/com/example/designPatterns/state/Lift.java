package com.example.designPatterns.state;

/**
 * 上下文类
 * 
 * @author HL_Yin
 *
 */
public class Lift {

	// 定义 出 所有 的 电梯 状态
	public final static OpenningState openningState = new OpenningState();
	public final static ClosingState closeingState = new ClosingState();
	public final static RunningState runningState = new RunningState();
	public final static StoppingState stoppingState = new StoppingState();
	// 定义 一个 当前 电梯 状态
	private LiftState liftState;

	public LiftState getLiftState() {
		return liftState;
	}

	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
		// 把 当前 的 环境 通知 到 各个 实现 类 中
		this.liftState.setLift(this);
	}

	public void open() {
		this.liftState.open();
	}

	public void close() {
		this.liftState.close();
	}

	public void run() {
		this.liftState.run();
	}

	public void stop() {
		this.liftState.stop();
	}

}

package com.example.designPatterns.state;

/**
 * 电梯关门状态
 * 
 * @author HL_Yin
 *
 */
public class ClosingState extends LiftState {

	@Override
	public void open() {
		super.lift.setLiftState(Lift.openningState);
		// 置 为 敞 门 状态
		super.lift.getLiftState().open();

	}

	@Override
	public void close() {
		System.out.println("电梯关门。。。");

	}

	@Override
	public void run() {
		super.lift.setLiftState(Lift.runningState);
		// 设置 为 运行 状态
		super.lift.getLiftState().run();

	}

	@Override
	public void stop() {
		super.lift.setLiftState(Lift.stoppingState);
		// 设置 为 停止 状态
		super.lift.getLiftState().stop();

	}

}

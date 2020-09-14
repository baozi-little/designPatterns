package com.example.designPatterns.state;

/**
 * 电梯开门状态
 * 
 * @author HL_Yin
 *
 */
public class OpenningState extends LiftState {

	@Override
	public void open() {

		System.out.println("电梯门开启。。。");

	}

	@Override
	public void close() {
		// 状态 修改
		super.lift.setLiftState(Lift.closeingState);
		// 动作 委托 为 CloseState 来 执行
		super.lift.getLiftState().close();

	}

	@Override
	public void run() {
		// do nothing
	}

	@Override
	public void stop() {
		// do nothing
	}

}

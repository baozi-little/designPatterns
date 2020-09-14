package com.example.designPatterns.state;

/**
 * 电梯停止状态
 * @author HL_Yin
 *
 */
public class StoppingState extends LiftState {

	@Override
	public void open() {

		super.lift.setLiftState(Lift.openningState);
		super.lift.getLiftState().open();
	}

	@Override
	public void close() {

		super.lift.setLiftState(Lift.closeingState);
		super.lift.getLiftState().close();
	}

	@Override
	public void run() {

		super.lift.setLiftState(Lift.runningState);
		super.lift.getLiftState().run();
	}

	@Override
	public void stop() {

		System.out.println("电梯停止。。。");
	}

}

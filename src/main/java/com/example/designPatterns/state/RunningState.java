package com.example.designPatterns.state;

/**
 * 电梯运行状态
 * @author HL_Yin
 *
 */
public class RunningState extends LiftState {

	@Override
	public void open() {

		// do nothing
	}

	@Override
	public void close() {
		// do nothing
		
	}

	@Override
	public void run() {
		System.out.println("电梯正在运行。。。");
		
	}

	@Override
	public void stop() {

		super.lift.setLiftState(Lift.stoppingState);
		super.lift.getLiftState().stop();
	}

}

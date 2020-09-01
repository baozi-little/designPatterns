package com.example.designPatterns.strategy;

/**
 * 妙计二（吴国太开绿灯）
 * @author HL_Yin
 *
 */
public class GivenGreenLight implements IStrategy {

	@Override
	public void operate() {
		System. out. println("求吴国太开绿灯，放行！");

	}

}

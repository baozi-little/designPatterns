package com.example.designPatterns.command;

/**
 * 增加一个功能
 * @author HL_Yin
 *
 */
public class AddCodeCommand extends Command {

	@Override
	public void execute() {

		// 找到代码组
		super.codeGroup.find();
		
		// 增加一个功能
		super.codeGroup.add();
		
		// 给出一份计划
		super.codeGroup.plan();
	}

}

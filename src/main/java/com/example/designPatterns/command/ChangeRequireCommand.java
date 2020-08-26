package com.example.designPatterns.command;

/**
 * 需求变更
 * @author HL_Yin
 *
 */
public class ChangeRequireCommand extends Command {

	@Override
	public void execute() {

		//找到需求者组
		super.requirementGroup.find();
		
		//需求变更
		super.requirementGroup.change();
		
		//给出一份计划
		super.requirementGroup.plan();
	}

}

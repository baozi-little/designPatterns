package com.example.designPatterns.command;

/**
 * 命令
 * @author HL_Yin
 *
 */
public abstract class Command {

	protected CodeGroup codeGroup = new CodeGroup();
	
	protected RequirementGroup requirementGroup = new RequirementGroup();
	
	protected PageGroup pageGroup = new PageGroup();
	
	// 执行命令
	public abstract void execute();
}

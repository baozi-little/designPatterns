package com.example.designPatterns.command;

/**
 * 删除界面命令
 * @author HL_Yin
 *
 */
public class DeletePageCommand extends Command {

	@Override
	public void execute() {
		
		// 找到界面组
		super.pageGroup.find();
		
		// 删除一个界面
		super.pageGroup.delete();
		
		// 给出一份计划
		super.pageGroup.plan();
	}

}

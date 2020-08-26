package com.example.designPatterns.command;

/**
 * 负责人
 * @author HL_Yin
 *
 */
public class Invoker {

	private Command command;
	
	// 给负责人一个命令
	public void setCommand(Command command) {
		this.command = command;
	}
	
	// 负责人执行相关的命令
	public void action() {
		this.command.execute();
	}
}

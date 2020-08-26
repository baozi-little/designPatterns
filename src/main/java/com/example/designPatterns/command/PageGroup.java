package com.example.designPatterns.command;

/**
 * 
 * 界面组
 * @author HL_Yin
 *
 */
public class PageGroup extends Group {

	@Override
	public void find() {

		System.out.println("找到界面组。。");
	}

	@Override
	public void add() {

		System.out.println("增加界面。。");
	}

	@Override
	public void delete() {

		System.out.println("删除界面。。");
	}

	@Override
	public void change() {

		System.out.println("修改界面。。");
	}

	@Override
	public void plan() {

		System.out.println("界面变更计划。。");
	}
 
}

package com.example.designPatterns.decorator;

/**
 * 具体修饰类（班级排名）
 * @author HL_Yin
 *
 */
public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport schoolReport) {
		super(schoolReport);
	}
	
	// 汇报一下自己在班级的排名
	private void reportSort() {
		System. out. println(" 我是 排名 第 38 名...");

	}
	
	@Override
	public void report() {
		super.report();
		// 汇报成绩之后汇报排名
		this.reportSort();
	}

}

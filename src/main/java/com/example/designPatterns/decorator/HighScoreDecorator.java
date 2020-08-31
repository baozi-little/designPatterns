package com.example.designPatterns.decorator;

/**
 * 具体修饰类（班级最高成绩）
 * @author HL_Yin
 *
 */
public class HighScoreDecorator extends Decorator {

	public HighScoreDecorator(SchoolReport schoolReport) {
		super(schoolReport);
	}
	
	// 汇报一下班级的最高成绩，掩饰一下自己的尴尬
	private void reportHighScore() {
		System. out. println(" 这次 考试语文 最高 是 75， 数学 是 78， 自然 是 80 ");

	}
	
	@Override
	public void report() {
		// 汇报成绩之前先汇报班级最高成绩
		this.reportHighScore();
		super.report();
	}

}

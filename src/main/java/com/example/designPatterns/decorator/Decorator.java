package com.example.designPatterns.decorator;

/**
 * 装饰抽象类
 * @author HL_Yin
 *
 */
public class Decorator extends SchoolReport {

	private SchoolReport SchoolReport = null;
	
	public Decorator(SchoolReport schoolReport) {
		this.SchoolReport = schoolReport;
	}
	
	@Override
	public void report() {
		this.SchoolReport.report();
	}

	@Override
	public void sign(String name) {

		this.SchoolReport.sign(name);
	}

}

package com.example.designPatterns.visitor;

/**
 * 普通员工
 * 
 * @author HL_Yin
 *
 */
public class CommonEmployee extends Employee {

	// 允许访问者访问
	@Override
	public void accept(IVisitor visitor) {

		visitor.visit(this);
	}

	// 工作 内容， 这 非常 重要， 以后 的 职业 规划 就是 靠 它 了
	private String job;

	public String getJob() {	
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}

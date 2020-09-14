package com.example.designPatterns.visitor;

/**
 * 管理层员工
 * 
 * @author HL_Yin
 *
 */
public class Manager extends Employee {

	// 允许访问者访问
	@Override
	public void accept(IVisitor visitor) {

		visitor.visit(this);
	}

	// 这类 人物 的 职责 非常 明确： 业绩
	private String performance;

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

}

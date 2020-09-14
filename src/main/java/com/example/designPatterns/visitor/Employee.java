package com.example.designPatterns.visitor;

/**
 * 员工抽象类
 * @author HL_Yin
 *
 */
public abstract class Employee {

	// 0 代表 是 男性
	public final static int MALE = 0;
	// 1 代表 是 女性
	public final static int FEMALE = 1;
	// 姓名
	private String name;
	// 只要 是 员工 那就 有薪水
	private int salary;
	// 性别 很重 要
	private int sex;

	// 以下 是 简单 的 getter/ setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	// 我 允许 一个 访问者 访问
	public abstract void accept(IVisitor visitor);

}

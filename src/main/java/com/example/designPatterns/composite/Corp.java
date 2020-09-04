package com.example.designPatterns.composite;

/**
 * 抽象公司职员类
 * 
 * @author HL_Yin
 *
 */
public abstract class Corp {

	// 公司 每个人 都有 名称
	private String name = "";

	// 公司 每个人 都有 职位
	private String position = "";

	// 公司 每个人 都有 薪水
	private int salary = 0;

	public Corp(String _name, String _position, int _salary) {
		this.name = _name;
		this.position = _position;
		this.salary = _salary;
	}

	// 获得 员工 信息
	public String getInfo() {
		String info = "";
		info = "姓名：" + this.name;
		info = info + "\t 职位：" + this.position;
		info = info + "\t 薪水：" + this.salary;
		return info;
	}

}

package com.example.designPatterns.iterator;

import java.util.ArrayList;

public class Project implements IProject {

	// 定义 一个 项目 列表， 所有 的 项目 都 放在 这里
	private ArrayList<IProject> projectList = new ArrayList<IProject>();

	// 项目 名称
	private String name = "";

	// 项目 成员 数量
	private int num = 0;

	// 项目 费用
	private int cost = 0;

	public Project() {
	}

	// 定义 一个 构造 函数， 把 所有 老板 需要 看到 的信息 存储 起来
	private Project(String name, int num, int cost) {
		// 赋值 到 类 的 成员 变量 中
		this.name = name;
		this.num = num;
		this.cost = cost;
	}

	// 增加 项目
	@Override
	public void add(String name, int num, int cost) {

		this.projectList.add(new Project(name, num, cost));

	}

	@Override
	public String getProjectInfo() {
		String info = "";

		// 获得 项目 的 名称
		info = info + "项目 名称 是：" + this.name;

		// 获得 项目 人数
		info = info + "\t 项目 人数: " + this.num;

		// 项目 费用
		info = info + "\t 项目 费用：" + this.cost;

		return info;

	}

	@Override
	public IProjectIterator iterator() {
		return new ProjectIterator(projectList);
	}

}

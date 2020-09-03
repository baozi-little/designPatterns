package com.example.designPatterns.iterator;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {

	// 所有 的 项目 都 放在 ArrayList 中
	private ArrayList<IProject> projectList = new ArrayList<IProject>();

	private int currentItem = 0;

	// 构造 函数 传入 projectList
	public ProjectIterator(ArrayList<IProject> projectList) {
		this.projectList = projectList;
	}

	@Override
	public boolean hasNext() {
		// 定义 一个 返回 值
		boolean b = true;
		if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
			b = false;
		}
		return b;

	}

	@Override
	public IProject next() {
		return (IProject) this.projectList.get(this.currentItem++);

	}

}

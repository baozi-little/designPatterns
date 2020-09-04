package com.example.designPatterns.composite;

import java.util.ArrayList;

/**
 * 树枝节点
 * 
 * @author HL_Yin
 *
 */
public class Branch extends Corp {

	// 领导 下边 有 哪些 下级 领导 和 小兵
	ArrayList<Corp> subordinateList = new ArrayList<Corp>();

	// 构造 函数 是 必需 的
	public Branch(String _name, String _position, int _salary) {
		super(_name, _position, _salary);
	}

	// 增加 一个 下属， 可能 是 小 头目， 也可能 是个 小兵
	public void addSubordinate(Corp corp) {
		this.subordinateList.add(corp);
	}

	// 我有 哪些 下属
	public ArrayList<Corp> getSubordinate() {
		return this.subordinateList;
	}

}

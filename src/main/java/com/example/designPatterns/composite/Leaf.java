package com.example.designPatterns.composite;

/**
 * 树叶节点
 * @author HL_Yin
 *
 */
public class Leaf extends Corp {

	//就 写 一个 构造 函数， 这个 是 必需 的
	public Leaf(String _name, String _position, int _salary) {
		super(_name, _position, _salary);
	}

}

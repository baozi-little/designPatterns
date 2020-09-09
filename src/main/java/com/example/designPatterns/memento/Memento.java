package com.example.designPatterns.memento;

/**
 * 备忘录类（记录原始状态）
 * 
 * @author HL_Yin
 *
 */
public class Memento {

	// 男孩 的 状态
	private String state = "";

	// 通过 构造 函数 传递 状态 信息
	public Memento(String _state) {
		this.state = _state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}

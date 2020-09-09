package com.example.designPatterns.memento;

/**
 * 男孩类（需要回复原始状态的类）
 * 
 * @author HL_Yin
 *
 */
public class Boy {

	// 男孩 的 状态
	private String state = "";

	// 认识 女孩子 后 状态 肯定 改变， 比如 心情、 手中的 花 等
	public void changeState() {
		this.state = "心情 可能 很不 好";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// 保留 一个 备份
	public Memento createMemento() {
		return new Memento(this.state);
	}

	// //恢复 一个 备份
	public void restoreMemento(Memento _memento) {
		this.setState(_memento.getState());
	}

}

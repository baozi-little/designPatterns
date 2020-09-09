package com.example.designPatterns.memento;

/**
 * 备忘录管理者类
 * 
 * @author HL_Yin
 *
 */
public class Caretaker {

	// 备忘录 对象
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}

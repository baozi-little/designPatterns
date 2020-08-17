package com.example.designPatterns.singleton.service;

import com.example.designPatterns.singleton.common.IMinister;
import com.example.designPatterns.singleton.model.Emperor;

public class Minister implements IMinister {

	public Minister() {
		super();
	}

	Emperor emperor;
	
	@Override
	public void meeting() {
		
		for (int i = 0; i < 3; i++) {
			emperor = Emperor.getInstance();
			emperor.say();
			
		}
	}
}

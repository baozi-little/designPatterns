package com.example.designPatterns.singleton.lazy.service;

import com.example.designPatterns.singleton.common.IMinister;
import com.example.designPatterns.singleton.lazy.model.Emperor;

public class LazyMinister implements IMinister {
	
	Emperor emperor;
	
	@Override
	public void meeting() {
		for (int i = 0; i < 3; i++) {
			emperor = Emperor.getInstance();
			emperor.say();
		}
	}

}

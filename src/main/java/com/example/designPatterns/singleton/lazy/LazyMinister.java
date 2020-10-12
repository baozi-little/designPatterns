package com.example.designPatterns.singleton.lazy;

import com.example.designPatterns.singleton.IMinister;

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

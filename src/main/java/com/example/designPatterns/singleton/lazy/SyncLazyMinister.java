package com.example.designPatterns.singleton.lazy;

import com.example.designPatterns.singleton.IMinister;

public class SyncLazyMinister implements IMinister {
	
	SyncEmperor syncEmperor;
	
	@Override
	public void meeting() {
		for (int i = 0; i < 3; i++) {
			syncEmperor = SyncEmperor.getInstance();
			syncEmperor.say();
		}
	}

}

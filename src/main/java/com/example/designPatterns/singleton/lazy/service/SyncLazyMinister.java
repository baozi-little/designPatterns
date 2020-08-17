package com.example.designPatterns.singleton.lazy.service;

import com.example.designPatterns.singleton.common.IMinister;
import com.example.designPatterns.singleton.lazy.model.SyncEmperor;

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

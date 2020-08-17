package com.example.designPatterns.singleton.lazy.service;

import com.example.designPatterns.singleton.common.IMinister;
import com.example.designPatterns.singleton.lazy.model.DoubleCheckEmperor;

public class DoubleCheckLazyMinister implements IMinister {
	
	DoubleCheckEmperor doubleCheckEmperor;
	
	@Override
	public void meeting() {
		for (int i = 0; i < 3; i++) {
			doubleCheckEmperor = DoubleCheckEmperor.getInstance();
			doubleCheckEmperor.say();
		}
	}

}

package com.example.designPatterns.singleton.lazy;

import com.example.designPatterns.singleton.IMinister;

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

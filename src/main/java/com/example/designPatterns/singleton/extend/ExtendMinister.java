package com.example.designPatterns.singleton.extend;

public class ExtendMinister implements IExtendMinister{

	Emperor emperor;
	
	@Override
	public void meeting() {
		for (int i = 0; i < 5; i++) {
			emperor = Emperor.getInstance();
			emperor.say();
		}
	}

}

package com.example.designPatterns.singleton.lazy;

public class SyncEmperor {

	private SyncEmperor() {
		super();
	}

	private static SyncEmperor emperor;
	
	// sync
	// 并发处理
	public static synchronized SyncEmperor getInstance() {
		
		if (emperor == null) {
			emperor = new SyncEmperor();
		}
		
		return emperor;
	}
	
	public void say() {
		System.out.println("I'm emperor !");
	}
}

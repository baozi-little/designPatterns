package com.example.designPatterns.singleton.extend;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Emperor {
	
	private static int maxNumberOfEmperor = 2;
	private static List<String> nameList = new ArrayList<String>();
	private static List<Emperor> emperors = new ArrayList<Emperor>();
	private static int currentNumberOfEmperor = 0;
	
	private Emperor() {
		super();
	}
	
	private Emperor(String name) {
		nameList.add(name);
	}
	
	static {
		for (int i = 0; i < maxNumberOfEmperor; i++) {
			emperors.add(new Emperor("Emperor " + i));
		}
	}
	
	public static Emperor getInstance() {
		Random random = new Random();
		currentNumberOfEmperor = random.nextInt(maxNumberOfEmperor);
		return emperors.get(currentNumberOfEmperor);
		
	}
	
	public void say() {
		System.out.println("I'm " + nameList.get(currentNumberOfEmperor) + " !");
	}

}

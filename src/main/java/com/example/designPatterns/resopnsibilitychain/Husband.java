package com.example.designPatterns.resopnsibilitychain;

public class Husband extends Handler {

	public Husband() {
		super(HUSBAND_LEVEL_REQUEST);
	}

	@Override
	public void response(IWomen women) {

		System.out.println("妻子向丈夫请示。");
		System.out.println(women.getRequest());
		System.out.println("同意妻子的请求。");
	}

}

package com.example.designPatterns.resopnsibilitychain;

public class Son extends Handler {

	public Son() {
		super(SON_LEVEL_REQUEST);
	}

	@Override
	public void response(IWomen women) {

		System.out.println("母亲向儿子请示。");
		System.out.println(women.getRequest());
		System.out.println("同意母亲的请求。");
	}

}

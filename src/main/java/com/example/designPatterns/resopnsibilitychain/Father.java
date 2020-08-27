package com.example.designPatterns.resopnsibilitychain;

public class Father extends Handler {

	public Father() {
		super(FATHER_LEVEL_REQUEST);
	}

	@Override
	public void response(IWomen women) {

		System.out.println("女儿向父亲请示。");
		System.out.println(women.getRequest());
		System.out.println("父亲同意女儿的请求。");
	}

}

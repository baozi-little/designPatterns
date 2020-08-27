package com.example.designPatterns.resopnsibilitychain;

public class Women implements IWomen {

	// 个人状况
	private int type = 0;
	
	// 个人请求
	private String request = "";
	
	public Women(int type, String request) {

		this.type = type;
		this.request = request;
		
		switch (this.type) {
		case 1:
			System.out.println("女儿的请求是：" + this.request);
			break;
		case 2:
			System.out.println("妻子的请求是：" + this.request);
			break;
		case 3:
			System.out.println("母亲的请求是：" + this.request);
			break;
		default:
			System.out.println("没有对应的责任级别。");
			break;
		}
	}
	
	@Override
	public int getType() {
		return this.type;
	}

	@Override
	public String getRequest() {
		return this.request;
	}

}

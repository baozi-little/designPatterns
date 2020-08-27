package com.example.designPatterns.resopnsibilitychain;

/**
 * 责任人类
 * @author HL_Yin
 *
 */
public abstract class Handler {

	public final static int FATHER_LEVEL_REQUEST = 1;
	
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	
	public final static int SON_LEVEL_REQUEST = 3;
	
	// 能处理的级别：1.father 2.husband 3.son
	private int level = 0;
	
	// 下一级责任人
	private Handler nextHandler;
	
	// 每个人都有对应的责任级别
	public Handler(int level) {
		this.level = level;
	}
	
	public void setNexHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	// 回应
	protected abstract void response(IWomen women);
	
	public final void handleMessage(IWomen women) {
		if (women.getType() == this.level) {
			this.response(women);
		}else {
			if (this.nextHandler != null) {
				this.nextHandler.handleMessage(women);
			}else {
				System.out.println("没找到对应的责任人，直接按照不同意处理。");
			}
		}
	}
}

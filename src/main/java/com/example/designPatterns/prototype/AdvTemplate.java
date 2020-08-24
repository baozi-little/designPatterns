package com.example.designPatterns.prototype;

public class AdvTemplate {

	// 广告 信 名称
	private String advSubject = " XX 银行 国庆 信用卡 抽奖 活动";
	// 广告 信 内容
	private String advContext = "国庆 抽奖 活动 通知： 只要 刷 卡 就 送 你 一百万！...";
	// 取得 广告 信 的 名称

	public String getAdvSubject() {
		return this.advSubject;
	}

	// 取得 广告 信 的 内容
	public String getAdvContext() {
		return this.advContext;
	}

}

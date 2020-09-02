package com.example.designPatterns.adapter;

/**
 * 人员信息接口
 * @author HL_Yin
 *
 */
public interface IUserInfo {

	//获得 用户 姓名 
	public String getUserName(); 
	
	//获得 家庭 地址 
	public String getHomeAddress(); 
	
	//手机 号码， 这个 太重 要， 手机 泛滥 呀 
	public String getMobileNumber(); 
	
	//办公 电话， 一般 是 座机 
	public String getOfficeTelNumber(); 
	
	//这个 人的 职位 是什么 
	public String getJobPosition();
	
	//获得 家庭 电话， 这有 点 不好， 我不 喜欢 打 家庭 电话 讨论 工作 
	public String getHomeTelNumber();


}

package com.example.designPatterns.adapter;

import java.util.Map;

/**
 * 其他项目中的人员信息接口
 * @author HL_Yin
 *
 */
public interface IOtherUser {

	// 获取基本信息
	public Map<String, String> getUserBaseInfo();
	
	// 获取公司信息
	public Map<String, String> getUserOfficeInfo();
	
	// 获取家庭信息
	public Map<String, String> getUserHomeInfo();
}

package com.example.designPatterns.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * 其他项目中人员信息类
 * @author HL_Yin
 *
 */
public class OtherUser implements IOtherUser {

	@Override
	public Map<String, String> getUserBaseInfo() {
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("userName", "员工李四");
		hashMap.put("mobilePhone", "手机号是1212");
		return hashMap;
	}

	@Override
	public Map<String, String> getUserOfficeInfo() {
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("jobPosition", "职位是开发小菜鸡");
		hashMap.put("officeTelNumber", "公司电话是3434");
		return hashMap;
	}

	@Override
	public Map<String, String> getUserHomeInfo() {
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("homeTelNumber", "家庭电话是5656");
		hashMap.put("homeAddress", "住在市中心");
		return hashMap;
	}

}

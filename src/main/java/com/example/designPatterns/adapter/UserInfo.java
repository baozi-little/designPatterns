package com.example.designPatterns.adapter;

/**
 * 投产中的人员信息类
 * @author HL_Yin
 *
 */
public class UserInfo implements IUserInfo {

	@Override
	public String getUserName() {

		System.out.println("员工张三");
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println("住在市中心");
		return null;
	}

	@Override
	public String getMobileNumber() {
		System.out.println("手机号是0000");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("公司电话号码是1111");
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println("职位是个开发小菜鸡");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("家庭电话号码是2222");
		return null;
	}

}

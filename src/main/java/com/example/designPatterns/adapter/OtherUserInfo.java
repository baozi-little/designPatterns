package com.example.designPatterns.adapter;

/**
 * 其他公司人员信息适配器类
 * @author HL_Yin
 *
 */
public class OtherUserInfo extends OtherUser implements IUserInfo {

	@Override
	public String getUserName() {

		String userName = super.getUserBaseInfo().get("userName");
		System.out.println(userName);
		return null;
	}

	@Override
	public String getHomeAddress() {
		String homeAddress = super.getUserHomeInfo().get("homeAddress");
		System.out.println(homeAddress);
		return null;
	}

	@Override
	public String getMobileNumber() {
		String mobileNumber = super.getUserBaseInfo().get("mobilePhone");
		System.out.println(mobileNumber);
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		String officeTelNumber = super.getUserOfficeInfo().get("officeTelNumber");
		System.out.println(officeTelNumber);
		return null;
	}

	@Override
	public String getJobPosition() {
		String jobPosition = super.getUserOfficeInfo().get("jobPosition");
		System.out.println(jobPosition);
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		String homeTelNumber = super.getUserHomeInfo().get("homeTelNumber");
		System.out.println(homeTelNumber);
		return null;
	}

	
}

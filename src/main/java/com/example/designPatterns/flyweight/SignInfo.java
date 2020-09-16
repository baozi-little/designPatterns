package com.example.designPatterns.flyweight;

/**
 * 报考信息类
 * @author HL_Yin
 *
 */
public class SignInfo {

	//报名 人员 的 ID 
	private String id; 
	//考试 地点 
	private String location; 
	//考试 科目 
	private String subject;
	//邮寄 地址 
	private String postAddress;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPostAddress() {
		return postAddress;
	}
	public void setPostAddress(String postAddress) {
		this.postAddress = postAddress;
	}

}

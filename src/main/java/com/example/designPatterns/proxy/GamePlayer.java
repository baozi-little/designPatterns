package com.example.designPatterns.proxy;

import org.springframework.util.StringUtils;

public class GamePlayer implements IGamePlayer {

	public String username;
	
	public GamePlayer(String username){
		this.username = username;
	}
	
	@Override
	public void login(String userName, String pwd) {
		
		if (!StringUtils.isEmpty(userName) && this.username == userName) {
			System.out.println(this.username + "登录成功！");
		}
	}
	
	@Override
	public void killBoss() {
		
		System.out.println(this.username + "正在打怪！");
	}

	@Override
	public void upgrade() {
		
		System.out.println(this.username + "升级了！");
	}



}

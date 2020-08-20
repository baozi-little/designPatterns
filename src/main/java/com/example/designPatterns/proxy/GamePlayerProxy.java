package com.example.designPatterns.proxy;

public class GamePlayerProxy implements IGamePlayer {

	IGamePlayer gamePlayer = null;
	
	public GamePlayerProxy(IGamePlayer gamePlayer) {

		this.gamePlayer = gamePlayer;
	}
	
	@Override
	public void login(String userName, String pwd) {

		this.gamePlayer.login(userName, pwd);
	}

	@Override
	public void killBoss() {
		
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {

		this.gamePlayer.upgrade();
	}

}

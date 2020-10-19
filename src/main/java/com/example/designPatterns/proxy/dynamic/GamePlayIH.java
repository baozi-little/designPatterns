package com.example.designPatterns.proxy.dynamic;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.InvocationHandler;

public class GamePlayIH implements InvocationHandler {

	// 被 代理 的 实例
	Object obj = null;

	// 我要 代理 谁
	public GamePlayIH(Object _obj) {
		this.obj = _obj;
	}

	// 调用 被 代理 的 方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(this.obj, args);
		// 如果 是 登录 方法， 则 发送 信息
		if (method.getName().equalsIgnoreCase("login")) {
			System.out.println(" 有人 在用 我的 账号 登录！");
		}

		return result;
	}

}

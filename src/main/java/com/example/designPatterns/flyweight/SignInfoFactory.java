package com.example.designPatterns.flyweight;

import java.util.HashMap;

/**
 * 带对象池的工厂类
 * 
 * @author HL_Yin
 *
 */
public class SignInfoFactory {

	// 池 容器
	private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();

	// 报名 信息 的 对象 工厂
	@Deprecated
	public static SignInfo SignInfo() {
		return new SignInfo();
	}

	// 从 池 中 获得 对象
	public static SignInfo getSignInfo(String key) {
		// 设置 返回 对象
		SignInfo result = null;
		// 池 中 没有 该 对象， 则 建立， 并 放入 池 中
		if (!pool.containsKey(key)) {
			System.out.println(key + "----建立 对象， 并 放置 到 池 中");
			result = new SignInfo4Pool(key);
			pool.put(key, result);
		} else {
			result = pool.get(key);
			System.out.println(key + "--- 直接 从 池 中 取得");
		}
		return result;
	}

}

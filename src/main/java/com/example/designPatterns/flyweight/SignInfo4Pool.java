package com.example.designPatterns.flyweight;

/**
 * 带对象池的报考信息类
 * @author HL_Yin
 *
 */
public class SignInfo4Pool extends SignInfo {

	// 定义 一个 对象 池 提取 的 KEY 值
	private String key;

	// 构造 函数 获得 相同 标志
	public SignInfo4Pool(String _key) {
		this.key = _key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}

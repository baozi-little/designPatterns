package com.example.designPatterns.interpreter;

import java.util.HashMap;

/**
 * 抽象表达式类
 * @author HL_Yin
 *
 */
public abstract class Expression {

	// 解析 公式 和 数值， 其中 var 中的 key 值 是 公式 中的 参数， value 值 是 具体 的 数字
	public abstract int interpreter(HashMap< String, Integer> var);

}

package com.example.designPatterns.interpreter;

import java.util.HashMap;

/**
 * 变量解释器
 * 
 * @author HL_Yin
 *
 */
public class VarExpression extends Expression {

	private String key;

	public VarExpression(String _key) {
		this.key = _key;
	}

	// 从 map 中 取之
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}

}

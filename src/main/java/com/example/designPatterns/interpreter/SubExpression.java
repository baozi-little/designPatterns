package com.example.designPatterns.interpreter;

import java.util.HashMap;

/**
 * 减法解释器
 * 
 * @author HL_Yin
 *
 */
public class SubExpression extends SymbolExpression {

	public SubExpression(Expression _left, Expression _right) {
		super(_left, _right);
	}

	// 左右 两个 表达式 相减
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}

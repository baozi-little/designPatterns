package com.example.designPatterns.interpreter;

import java.util.HashMap;

/**
 * 加法解释器
 * 
 * @author HL_Yin
 *
 */
public class AddExpression extends SymbolExpression {

	public AddExpression(Expression _left, Expression _right) {
		super(_left, _right);
	}

	// 把 左右 两个 表达式 运算 的 结果 加 起来
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) + super.right.interpreter(var);
	}
}

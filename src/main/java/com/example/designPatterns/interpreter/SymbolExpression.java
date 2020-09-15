package com.example.designPatterns.interpreter;

/**
 * 抽象运算符解释器
 * 
 * @author HL_Yin
 *
 */
public abstract class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	// 所有 的 解析 公式 都应 只 关心 自己 左右 两个 表达式 的 结果
	public SymbolExpression(Expression _left, Expression _right) {
		this.left = _left;
		this.right = _right;
	}
}

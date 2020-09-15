package com.example.designPatterns.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * 解释器封装类
 * 
 * @author HL_Yin
 *
 */
public class Calculator {

	// 定义 表达式
	private Expression expression;

	// 构造 函数 传 参， 并解 析
	public Calculator(String expStr) {
		// 定义 一个 栈， 安排 运算 的 先后 顺序
		Stack<Expression> stack = new Stack<Expression>();
		// 表达式 拆分 为 字符 数组
		char[] charArray = expStr.toCharArray();
		// 运算
		Expression left = null;
		Expression right = null;
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+':
				// 加法 
				//加法 结果 放到 栈 中
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new AddExpression(left, right));
				break;
			case '-':
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default:
				// 公式 中的 变量
				stack.push(new VarExpression(String.valueOf(charArray[i])));
			}
		}
		// 把 运算 结果 抛出 来
		this.expression = stack.pop();
	}

	// 开始 运算
	public int run(HashMap<String, Integer> var) {
		return this.expression.interpreter(var);
	}

}

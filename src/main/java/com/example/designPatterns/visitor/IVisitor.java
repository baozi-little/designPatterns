package com.example.designPatterns.visitor;

/**
 * 访问者接口
 * @author HL_Yin
 *
 */
public interface IVisitor {

	// 首先， 定义 我可 以 访问 普通 员工
	public void visit(CommonEmployee commonEmployee);

	// 其次， 定义 我还 可以 访问 部门 经理
	public void visit(Manager manager);

}

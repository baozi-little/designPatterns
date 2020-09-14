package com.example.designPatterns.visitor;

/**
 * 访问者类
 * 
 * @author HL_Yin
 *
 */
public class Visitor implements IVisitor {

	//访问 普通 员工， 打印 出 报表
	@Override
	public void visit(CommonEmployee commonEmployee) {
		System.out.println(this.getCommonEmployee(commonEmployee));

	}

	//访问 部门 经理， 打印 出 报表
	@Override
	public void visit(Manager manager) {
		System.out.println(this.getManagerInfo(manager));
	}

	// 组装 出 基本 信息
	private String getBasicInfo(Employee employee) {
		String info = "姓名：" + employee.getName() + "\t";
		info = info + "性别：" + (employee.getSex() == Employee.FEMALE ? " 女" : " 男") + "\t";
		info = info + "薪水：" + employee.getSalary() + "\t";
		return info;
	}

	// 组装 出 部门 经理 的 信息
	private String getManagerInfo(Manager manager) {
		String basicInfo = this.getBasicInfo(manager);
		String otherInfo = "业绩：" + manager.getPerformance() + "\t";
		return basicInfo + otherInfo;
	}

	// 组装 出 普通 员工 信息
	private String getCommonEmployee(CommonEmployee commonEmployee) {
		String basicInfo = this.getBasicInfo(commonEmployee);
		String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
		return basicInfo + otherInfo;
	}

}

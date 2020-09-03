package com.example.designPatterns.iterator;

public interface IProject {

	//增加 项目 
	public void add( String name, int num, int cost); 
	
	//项目 信息 
	public String getProjectInfo(); 
	
	//获得 一个 可以 被 遍历 的 对象 
	public IProjectIterator iterator();

}

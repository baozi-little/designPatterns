package com.example.designPatterns.facade;

/**
 * 写信接口（子系统）
 * @author HL_Yin
 *
 */
public interface ILetterProcess {

	//首先 要 写信 的 内容
	public void writeContext( String context); 
	
	//其次 写 信封 
	public void fillEnvelope( String address); 
	
	//把 信 放到 信 封里 
	public void letterInotoEnvelope(); 
	
	//然后 邮递 
	public void sendLetter();

}

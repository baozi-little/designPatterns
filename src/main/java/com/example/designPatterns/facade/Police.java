package com.example.designPatterns.facade;

/**
 * 检查类（子系统）
 * 
 * @author HL_Yin
 *
 */
public class Police {

	// 检查 信件， 检查 完毕 后 警察 在 信 封上 盖 个 戳： 此 信 无 病毒
	public void checkLetter(ILetterProcess letterProcess) {
		System.out.println(letterProcess + " 信件 已经 检查 过了...");
	}

}

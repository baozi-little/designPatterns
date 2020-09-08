package com.example.designPatterns.facade;

/**
 * 邮局类（子系统）
 * 
 * @author HL_Yin
 *
 */
public class ModenPostOffice {

	private ILetterProcess letterProcess = new LetterProcessImpl();
	private Police letterPolice = new Police();

	// 写信， 封装， 投递， 一体化 了
	public void sendLetter(String context, String address) {
		// 帮你 写信
		letterProcess.writeContext(context);
		//写好 信封 
		letterProcess. fillEnvelope( address); 
		//警察 要 检查 信件 了 
		letterPolice. checkLetter( letterProcess); 
		//把 信 放到 信封 中 
		letterProcess. letterInotoEnvelope(); 
		//邮递 信件 
		letterProcess. sendLetter();

	}

}

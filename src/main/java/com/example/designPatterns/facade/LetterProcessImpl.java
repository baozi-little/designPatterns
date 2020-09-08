package com.example.designPatterns.facade;

/**
 * 写信类（子系统）
 * @author HL_Yin
 *
 */
public class LetterProcessImpl implements ILetterProcess {

	@Override
	public void writeContext(String context) {

		System.out.println("写信内容：" + context);
	}

	@Override
	public void fillEnvelope(String address) {

		System.out.println("信封填写寄信地址：" + address);
	}

	@Override
	public void letterInotoEnvelope() {

		System.out.println("把信装进信封。。。");
	}

	@Override
	public void sendLetter() {

		System.out.println("邮递信件。。。");
	}

}

package com.example.designPatterns.facade;

/**
 * 门面类
 * @author HL_Yin
 *
 */
public class Facade {

 	private ModenPostOffice modenPostOffice = new ModenPostOffice();
	
	public void sendLetter(String context, String address) {
		modenPostOffice.sendLetter(context, address);
	}
}

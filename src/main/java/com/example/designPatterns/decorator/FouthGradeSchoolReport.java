package com.example.designPatterns.decorator;

/**
 * 四年级成绩单
 * @author HL_Yin
 *
 */
public class FouthGradeSchoolReport extends SchoolReport {

	@Override
	public void report() {
		//成绩单 的 格式 是 这个 样子 的 
		System. out. println(" 尊敬 的 XXX 家长:"); 
		System. out. println(" ......"); 
		System. out. println(" 语文 62 数学 65 体育 98 自然 63"); 
		System. out. println(" ......."); 
		System. out. println(" 家长 签名： ");
	}

	@Override
	public void sign(String name) {
		
		//家长签名
		System. out. println(" 家长 签名 为："+ name);

	}

}

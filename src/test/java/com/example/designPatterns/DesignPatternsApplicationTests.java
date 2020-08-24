package com.example.designPatterns;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.designPatterns.abstractfactory.service.AHuman;
import com.example.designPatterns.abstractfactory.service.FemaleHumanFactory;
import com.example.designPatterns.abstractfactory.service.MaleHumanFactory;
import com.example.designPatterns.builder.CarModel;
import com.example.designPatterns.builder.Director;
import com.example.designPatterns.factory.service.AbstractHumanFactory;
import com.example.designPatterns.factory.service.BlackHuman;
import com.example.designPatterns.factory.service.Human;
import com.example.designPatterns.factory.service.HumanFactory;
import com.example.designPatterns.factory.service.WhiteHuman;
import com.example.designPatterns.factory.service.YellowHuman;
import com.example.designPatterns.prototype.AdvTemplate;
import com.example.designPatterns.prototype.Mail;
import com.example.designPatterns.proxy.GamePlayer;
import com.example.designPatterns.proxy.GamePlayerProxy;
import com.example.designPatterns.proxy.IGamePlayer;
import com.example.designPatterns.singleton.extend.service.ExtendMinister;
import com.example.designPatterns.singleton.lazy.service.DoubleCheckLazyMinister;
import com.example.designPatterns.singleton.lazy.service.LazyMinister;
import com.example.designPatterns.singleton.lazy.service.SyncLazyMinister;
import com.example.designPatterns.singleton.service.Minister;
import com.example.designPatterns.templatemethod.HummerH1Model;
import com.example.designPatterns.templatemethod.HummerH2Model;
import com.example.designPatterns.templatemethod.HummerModel;

@SpringBootTest
class DesignPatternsApplicationTests {

	@Test
	void contextLoads() {
	}

	// 单例模式
	@Test
	void singletonTest() {
		Minister minister = new Minister();
		minister.meeting();

	}

	// 单例模式（懒汉模式）
	@Test
	void lazySingletonTest() {
		LazyMinister lazyMinister = new LazyMinister();
		lazyMinister.meeting();

	}

	// 懒汉单例模式（加锁）
	@Test
	void syncLazySingletonTest() {
		SyncLazyMinister syncLazyMinister = new SyncLazyMinister();
		syncLazyMinister.meeting();

	}

	// 懒汉单例模式（双重锁）
	@Test
	void doubleCheckSingletonTest() {
		DoubleCheckLazyMinister doubleCheckLazyMinister = new DoubleCheckLazyMinister();
		doubleCheckLazyMinister.meeting();

	}

	// 单例模式扩展（有上限的多例模式）
	@Test
	void extendSingleTest() {
		ExtendMinister extendMinister = new ExtendMinister();
		extendMinister.meeting();

	}

	// 工厂模式（需要知道具体的产品类，工厂创建对象的方式：反射）
	// 应用场景：产品种类单一，产品等级单一
	@Test
	void factoryTest() {
		AbstractHumanFactory humanFactory = new HumanFactory();
		// 生产一名黑人
		Human blackHuman = humanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		// 生产一名黄种人
		Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
		// 生产一名白人
		Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
	}

	// 抽象工厂模式（不需要知道具体的产品类，只需要知道生产该产品的工厂对应的方法，每个方法对应具体产品的创建，创建对象的方式：new）
	// 应用场景：产品等级层级较多
	@Test
	void abstractFactoryTest() {
		MaleHumanFactory maleHumanFactory = new MaleHumanFactory();
		FemaleHumanFactory femaleHumanFactory = new FemaleHumanFactory();
		// 生产一名男性黑人
		AHuman blackHuman = maleHumanFactory.createBlackHuman();
		blackHuman.getColor();
		blackHuman.talk();
		blackHuman.gender();
		// 生产一名女性黄种人
		AHuman yellowHuman = femaleHumanFactory.createYellowHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
		yellowHuman.gender();

	}

	// 代理模式
	@Test
	void proxyTest() {
		IGamePlayer gamePlayer = new GamePlayer("张三");
		// 帮张三代练
		IGamePlayer gamePlayerProxy = new GamePlayerProxy(gamePlayer);
		// 用张三的账号密码登录
		gamePlayerProxy.login("张三", "123456");
		// 代练打怪升级
		gamePlayerProxy.killBoss();
		gamePlayerProxy.upgrade();
	}

	// 模板方法模式（基本方法一般不对外暴露，访问权限应该设计为protected类型；模板方法一般不允许重写，应该使用final修饰）
	@Test
	void templateMethodTest() {
		HummerModel hummerH1Model = new HummerH1Model();
		hummerH1Model.run();
		HummerModel hummerH2Model = new HummerH2Model();
		hummerH2Model.run();
	}

	// 建造者模式（融合了模板方法模式）
	/**
	 * 另： 工厂模式；创建类模式，侧重于零件的实现，不考虑装配顺序 模板方法模式：非创建类模式，侧重于零件的实现，有特定的装配顺序
	 * 建造者模式：创建类模式，侧重于零件的装配顺序
	 * 
	 */
	@Test
	void builderTest() {

		Director director = new Director();
		CarModel aBenzModel = director.getABenzModel();
		aBenzModel.run();
		CarModel bBenzModel = director.getBBenzModel();
		bBenzModel.run();
		CarModel abmwModel = director.getABMWModel();
		abmwModel.run();

		// 扩展：只需要修改导演类，导演类可以定义多种零件的装配顺序
	}

	// 原型模式（其实就是使用Object的clone()来拷贝对象）
	/**
	 * 使用场景：
	 * 	当需要大量创建有共同属性的对象时，可以使用原型模式（对象拷贝）来实现，以节约new产生的大量开支。
	 *设计的知识点：
	 *	1.创建对象的方式：new、clone、反射
	 *	2.浅拷贝与深拷贝：
	 *		浅拷贝：
	 *			只有基本数据类型和string会被拷贝，其它引用类型是不会被拷贝的，如ArrayList，会共用一块堆内存，这就是浅拷贝。
	 *		深拷贝：
	 *			如果需要实现深拷贝，可以在clone()内调用该引用类型属性的clone方法，如arrayList.clone()。
	 *	3.Cloneable与clone()的关系：
	 *		Cloneable是java的一个接口，里面没有方法。起到标记的作用。
	 *		clone()：Object中的方法，对象拷贝的具体实现。
	 *		注意：想要实现对象的拷贝，必须要实现Cloneable和重写clone()，因为Cloneable是拷贝的前提，clone()在Object中的访问权限为protected。
	 */
	@Test
	void prototypeTest() {

		// 发十封邮件
		int MAX_COUNT = 10;

		AdvTemplate advTemplate = new AdvTemplate();
		// 创建对象并设置公共属性
		Mail mail = new Mail(advTemplate);
		mail.setTail("XX银行版权所有");

		int i = 0;
		while (i < MAX_COUNT) {
			// 拷贝
			Mail cloneMail = mail.clone();
			// 赋值个性
			cloneMail.setAppellation(new Random().nextInt() + "先生/女士");
			cloneMail.setReceiver(new Random().nextInt(100000) + "@163.com");
			i++;
			// 发邮件
			sendMail(cloneMail);
		}

	}

	// 发送邮件（实际应用中一般设计为多线程）
	void sendMail(Mail mail) {
		System.out.println(" 标题：" + mail.getSubject() + "\t 收件人： " + mail.getReceiver() + "\t... 发送 成功！");
	}

}

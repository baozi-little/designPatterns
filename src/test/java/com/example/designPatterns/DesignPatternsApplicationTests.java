package com.example.designPatterns;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.designPatterns.abstractfactory.service.AHuman;
import com.example.designPatterns.abstractfactory.service.FemaleHumanFactory;
import com.example.designPatterns.abstractfactory.service.MaleHumanFactory;
import com.example.designPatterns.abstractfactory.service.MaleBlackHuman;
import com.example.designPatterns.factory.service.AbstractHumanFactory;
import com.example.designPatterns.factory.service.BlackHuman;
import com.example.designPatterns.factory.service.Human;
import com.example.designPatterns.factory.service.HumanFactory;
import com.example.designPatterns.factory.service.WhiteHuman;
import com.example.designPatterns.factory.service.YellowHuman;
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

}

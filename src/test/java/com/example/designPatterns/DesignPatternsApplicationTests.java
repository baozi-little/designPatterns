package com.example.designPatterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.designPatterns.abstractfactory.service.AHuman;
import com.example.designPatterns.abstractfactory.service.FemaleHumanFactory;
import com.example.designPatterns.abstractfactory.service.MaleHumanFactory;
import com.example.designPatterns.adapter.IUserInfo;
import com.example.designPatterns.adapter.OtherUserInfo;
import com.example.designPatterns.adapter.UserInfo;
import com.example.designPatterns.bridge.House;
import com.example.designPatterns.bridge.HouseCorp;
import com.example.designPatterns.bridge.IPad;
import com.example.designPatterns.bridge.ShanZhaiCorp;
import com.example.designPatterns.builder.CarModel;
import com.example.designPatterns.builder.Director;
import com.example.designPatterns.command.AddCodeCommand;
import com.example.designPatterns.command.ChangeRequireCommand;
import com.example.designPatterns.command.DeletePageCommand;
import com.example.designPatterns.command.Invoker;
import com.example.designPatterns.composite.Branch;
import com.example.designPatterns.composite.Corp;
import com.example.designPatterns.composite.Leaf;
import com.example.designPatterns.decorator.FouthGradeSchoolReport;
import com.example.designPatterns.decorator.HighScoreDecorator;
import com.example.designPatterns.decorator.SchoolReport;
import com.example.designPatterns.decorator.SortDecorator;
import com.example.designPatterns.facade.Facade;
import com.example.designPatterns.factory.service.AbstractHumanFactory;
import com.example.designPatterns.factory.service.BlackHuman;
import com.example.designPatterns.factory.service.Human;
import com.example.designPatterns.factory.service.HumanFactory;
import com.example.designPatterns.factory.service.WhiteHuman;
import com.example.designPatterns.factory.service.YellowHuman;
import com.example.designPatterns.flyweight.SignInfo;
import com.example.designPatterns.flyweight.SignInfoFactory;
import com.example.designPatterns.interpreter.Calculator;
import com.example.designPatterns.iterator.IProject;
import com.example.designPatterns.iterator.IProjectIterator;
import com.example.designPatterns.iterator.Project;
import com.example.designPatterns.mediator.AbstractMediator;
import com.example.designPatterns.mediator.Mediator;
import com.example.designPatterns.mediator.Purchase;
import com.example.designPatterns.mediator.Sale;
import com.example.designPatterns.mediator.Stock;
import com.example.designPatterns.memento.Boy;
import com.example.designPatterns.memento.Caretaker;
import com.example.designPatterns.observer.HanFeiZi;
import com.example.designPatterns.observer.LiSi;
import com.example.designPatterns.observer.Other;
import com.example.designPatterns.prototype.AdvTemplate;
import com.example.designPatterns.prototype.Mail;
import com.example.designPatterns.proxy.GamePlayer;
import com.example.designPatterns.proxy.GamePlayerProxy;
import com.example.designPatterns.proxy.IGamePlayer;
import com.example.designPatterns.resopnsibilitychain.DefaultChain;
import com.example.designPatterns.resopnsibilitychain.IWomen;
import com.example.designPatterns.resopnsibilitychain.Women;
import com.example.designPatterns.singleton.extend.service.ExtendMinister;
import com.example.designPatterns.singleton.lazy.service.DoubleCheckLazyMinister;
import com.example.designPatterns.singleton.lazy.service.LazyMinister;
import com.example.designPatterns.singleton.lazy.service.SyncLazyMinister;
import com.example.designPatterns.singleton.service.Minister;
import com.example.designPatterns.state.Lift;
import com.example.designPatterns.strategy.BackDoor;
import com.example.designPatterns.strategy.BlockEnemy;
import com.example.designPatterns.strategy.Context;
import com.example.designPatterns.strategy.GivenGreenLight;
import com.example.designPatterns.templatemethod.HummerH1Model;
import com.example.designPatterns.templatemethod.HummerH2Model;
import com.example.designPatterns.templatemethod.HummerModel;
import com.example.designPatterns.visitor.CommonEmployee;
import com.example.designPatterns.visitor.Employee;
import com.example.designPatterns.visitor.Manager;
import com.example.designPatterns.visitor.Visitor;

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
	 * 使用场景： 当需要大量创建有共同属性的对象时，可以使用原型模式（对象拷贝）来实现，以节约new产生的大量开支。 设计的知识点：
	 * 1.创建对象的方式：new、clone、反射 2.浅拷贝与深拷贝： 浅拷贝：
	 * 只有基本数据类型和string会被拷贝，其它引用类型是不会被拷贝的，如ArrayList，会共用一块堆内存，这就是浅拷贝。 深拷贝：
	 * 如果需要实现深拷贝，可以在clone()内调用该引用类型属性的clone方法，如arrayList.clone()。
	 * 3.Cloneable与clone()的关系： Cloneable是java的一个接口，里面没有方法。起到标记的作用。
	 * clone()：Object中的方法，对象拷贝的具体实现。
	 * 注意：想要实现对象的拷贝，必须要实现Cloneable和重写clone()，因为Cloneable是拷贝的前提，clone()在Object中的访问权限为protected。
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

	// 中介者模式
	/**
	 * 应用场景：类间依赖较多，呈网状结构时（多对多），可以使用中介者模式，让中介去依赖协调各个类，优化为星状结构（一对多）
	 * 
	 * 中介者模式与代理模式的区别（个人理解）： 代理模式：代理类和具体类继承同一个类，外界只能通过代理类去调用具体类，从而对外界屏蔽具体类
	 * 中介者模式：每个具体类都依赖相同的中介类，某些需要依赖其他具体类的方法无具体实现，而是直接调用中介类的方法，让中介类去依赖其他类从而实现业务
	 */
	@Test
	void mediatorTest() {

		AbstractMediator mediator = new Mediator();
		// 采购电脑
//		Purchase purchase = new Purchase(mediator);
//		purchase.buyComputer(10);

		// 销售电脑
//		Sale sale = new Sale(mediator);
//		sale.sellComputer(10);

		// 折扣销售
//		Sale sale = new Sale(mediator);
//		sale.offSale();

		// 清空仓库
		Stock stock = new Stock(mediator);
		stock.clearStock();
	}

	// 命令模式
	/**
	 * 命令模式与建造者模式的异同：刚开始感觉挺像的（都是零件的组装），越想越感觉不像（从产品角度看，建造者是把零件组装成一个产品，命令模式是把多个小命令封装成一个大命令类）
	 * 
	 * 命令模式：将多个命令（方法）封装成一个命令类，一个命令类只执行一种指令，当命令越多，需要封装的命令类就越庞大。
	 */
	@Test
	void commandTest() {

		Invoker invoker = new Invoker();
		// 下达一个修改需求的命令
		invoker.setCommand(new ChangeRequireCommand());
		invoker.action();

		// 下达一个删除页面的命令
		invoker.setCommand(new DeletePageCommand());
		invoker.action();

		// 下达一个增加功能的命令
		invoker.setCommand(new AddCodeCommand());
		invoker.action();

		// 如果还想下达一个删除功能的命令，增加一个DeleteCodeCommand类即可
	}

	// 责任链模式（融合了模板方法模式）
	/**
	 * 基于递归来实现 优缺点： 优点：调用者不需要知道对应的责任人是谁，不需要做臃肿的if-else 缺点：链子过长，对性能的影响很大，其实就是递归的缺点
	 * 
	 * 扩展：可以封装不同链子来处理不同业务
	 */
	@Test
	void responsibilityChainTest() {

		// 使用默认链
		DefaultChain defaultChain = new DefaultChain();

		Random random = new Random();

		IWomen women;
		for (int i = 0; i < 5; i++) {
			// 随机挑选女性
			women = new Women(random.nextInt(4), "我要去逛街。");
			defaultChain.handle(women);

		}
	}

	// 装饰模式
	/**
	 * 装饰模式与代理模式的异同： 相同点：具体类和 装饰类\代理类 都是继承（实现）同一个抽象类（接口），外部不直接调用具体类，而是调用对应的 装饰类\代理类
	 * 不同点： 代理模式：外部不知道代理委托了另一个对象，主要起到屏蔽的作用（在代理类new具体类）
	 * 装饰模式：外部指定使用哪个修饰类，而且指定的修饰类理论上可以无限多。
	 * 
	 */
	// TODO 问题一：个人感觉这就是AOP模式，所以装饰模式与动态代理有什么区别呢？
	@Test
	void decoratorTest() {
		SchoolReport schoolReport = null;
		// 拿到成绩单
		schoolReport = new FouthGradeSchoolReport();
		// 修饰一（班级最高分）
		schoolReport = new HighScoreDecorator(schoolReport);
		// 修饰二（班级排名）
		schoolReport = new SortDecorator(schoolReport);
		// 成绩单内容
		schoolReport.report();
		// 家长签字
		schoolReport.sign("张三");

		// 扩展（如果需要增加更多的修饰，可以新建几个Decorator的子类，然后像以上一样new出来即可）
	}

	// 策略模式
	/**
	 * 策略模式与代理模式的区别： 策略 模式 的 封装 角色 和 被 封装 的 策略 类 不用 是 同一个 接口， 如果 是 同一个 接口 那就 成为 了
	 * 代理模式。
	 * 
	 * 它的定义为：定义 一组 算法， 将 每个 算法 都 封装 起来， 并且 使它 们 之间 可以 互换。
	 * 
	 * 其实就是继承和多态的实现而已。
	 */
	@Test
	void strategyTest() {
		// 锦囊
		Context context;
		// 妙计一
		context = new Context(new BackDoor());
		context.operate();
		// 妙计二
		context = new Context(new GivenGreenLight());
		context.operate();
		// 妙计三
		context = new Context(new BlockEnemy());
		context.operate();
	}

	// 适配器模式
	/**
	 * 使用场景：适用于投产中的项目，需要做一些扩展的时候，用来适配原来的项目，只改动小部分代码来实现适配。在项目设计阶段一般不考虑使用该模式。
	 * 
	 * 当不需要这个适配的时候可以直接去掉而不影响原来的项目正常运行。类似于一个灵活的构件，想用就用，不想用就卸载。
	 */
	@Test
	void adapterTest() {
		// 投产正常运行的项目
//		IUserInfo userInfo = new UserInfo();

		// 适配其他公司之后的项目
		IUserInfo userInfo;
		Random random = new Random();
		int selected = random.nextInt(2) + 1;
		if (selected == 1) {
			// 获取原来的用户
			userInfo = new UserInfo();
		} else {
			// 获取其他公司的用户
			userInfo = new OtherUserInfo();
		}

		userInfo.getUserName();
		userInfo.getHomeAddress();
		userInfo.getHomeTelNumber();
		userInfo.getOfficeTelNumber();
		userInfo.getJobPosition();
		userInfo.getMobileNumber();
	}

	// 迭代器模式（了解即可）
	/**
	 * 想要遍历容器里的所有对象，就可以使用迭代器模式去实现
	 * 
	 * Java中多个接口继承了迭代器接口，所以我们直接使用即可，如：ArrayList可以使用iterator()方法获取迭代器
	 * 
	 * foreach的底层也是实现了迭代器
	 * 
	 * 由于很多地方封装了迭代器，我们一般不会自己去封装一个迭代器，所以这个模式基本不会使用，有很多人已经把迭代器模式从设计模式去除。
	 * 
	 */
	@Test
	void iteratorTest() {
		// 定义 一个 List， 存放 所有 的 项目 对象
		IProject project = new Project();
		// 增加 星球 大战 项目
		project.add(" 星球 大战 项目 ", 10, 100000);
		// 增加 扭转 时空 项目
		project.add(" 扭转 时空 项目", 100, 10000000);
		// 增加 超人 改造 项目
		project.add(" 超人 改造 项目", 10000, 1000000000);

		// 获得迭代器
		IProjectIterator iterator = project.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getProjectInfo());
		}
	}

	// 组合模式
	/**
	 * 组合模式与责任链模式： 都是基于递归实现， 责任链模式：使用链式结构的业务上 组合模式：使用树（Tree）结构的业务上
	 */
	@Test
	void compositeTest() {
		// 首先 是 组装 一个 组织 结构 出来
		Branch ceo = compositeCorpTree();

		// 首先 把 CEO 的 信息 打印 出来
		System.out.println(ceo.getInfo());

		// 然后 是 所有 员工 信息
		System.out.println(getTreeInfo(ceo));

	}

	// 把 整个 树 组装 出来
	public static Branch compositeCorpTree() {
		// 首先 产生 总经理 CEO
		Branch root = new Branch(" 王 大麻子", " 总经理", 100000);
		// 把 三个 部门 经理 产生 出来
		Branch developDep = new Branch(" 刘 大 瘸子", " 研发 部门 经理", 10000);
		Branch salesDep = new Branch(" 马 二 拐子", " 销售 部门 经理", 20000);
		Branch financeDep = new Branch(" 赵 三 驼 子", " 财务 部 经理", 30000);
		// 再把 两个 开发 小组长 产生 出来
		Branch firstDevGroup = new Branch(" 杨 三 乜 斜", " 开发 一组 组长", 5000);
		Branch secondDevGroup = new Branch(" 吴 大 棒槌", " 开发 二 组 组长", 6000);
		// 把 所有 的 小兵 都 产生 出来
		Leaf a = new Leaf(" a", " 开发 人员", 2000);
		Leaf b = new Leaf(" b", " 开发 人员", 2000);
		Leaf c = new Leaf(" c", " 开发 人员", 2000);
		Leaf d = new Leaf(" d", " 开发 人员", 2000);
		Leaf h = new Leaf(" h", " 销售 人员", 5000);
		Leaf i = new Leaf(" i", " 销售 人员", 4000);
		Leaf j = new Leaf(" j", " 财务 人员", 5000);
		Leaf k = new Leaf(" k", " CEO 秘书", 8000);
		Leaf zhengLaoLiu = new Leaf(" 郑 老六", " 研发 部 副经理", 20000);
		// 开始 组装
		// CEO 下有 三个 部门 经理 和 一个 秘书
		root.addSubordinate(k);
		root.addSubordinate(developDep);
		root.addSubordinate(salesDep);
		root.addSubordinate(financeDep);
		// 研发 部 经理
		developDep.addSubordinate(zhengLaoLiu);
		developDep.addSubordinate(firstDevGroup);
		developDep.addSubordinate(secondDevGroup);
		// 看看 两个 开发 小组 下有 什么
		firstDevGroup.addSubordinate(a);
		firstDevGroup.addSubordinate(b);
		firstDevGroup.addSubordinate(c);
		secondDevGroup.addSubordinate(d);
		// 再看 销售部 下 的 人员 情况
		salesDep.addSubordinate(h);
		salesDep.addSubordinate(i);
		// 最后 一个 财务
		financeDep.addSubordinate(j);
		return root;
	}

	// 遍历 整 棵树, 只要 给我 根 节点， 我 就能 遍历 出 所有 的 节点
	public static String getTreeInfo(Branch root) {
		ArrayList<Corp> subordinateList = root.getSubordinate();
		String info = "";
		for (Corp s : subordinateList) {
			if (s instanceof Leaf) {
				// 是 员工 就 直接 获得 信息
				info = info + s.getInfo() + "\n";
			} else {
				// 是个 小 头目
				info = info + s.getInfo() + "\n" + getTreeInfo((Branch) s);
			}
		}
		return info;
	}

	// 观察者模式（发布订阅模式）
	/**
	 * 其实发布订阅模式更容易理解，我们可以从字面上去理解这个模式 订阅：addObserver() 就是一个订阅的过程，谁要订阅就add进来
	 * 发布：自身的一个行为发生，会通知到订阅者从而订阅者做相应的处理，这个通知的行为就是发布。
	 * 
	 * 消息队列就使用了这个模式。
	 * 
	 * 扩展：观察者和被观察者都很容易扩展，只要实现对应的接口即可
	 * 
	 * 注意：其中一个观察者的动作缓慢或者动作死机都会导致程序出问题，异步处理是个比较好的解决方法。
	 */
	@Test
	void observerTest() {
		// 韩非子（被观察者类）
		HanFeiZi hanFeiZi = new HanFeiZi();
		// 观察者类
		LiSi liSi = new LiSi();
		Other other = new Other();
		// 加入被观察者（被观察者如有行为变动需要通知如下观察者）
		hanFeiZi.addObserver(liSi);
		hanFeiZi.addObserver(other);
		// 被观察者的行为变动
		hanFeiZi.haveBreakfast();
		hanFeiZi.haveFun();
	}

	// 门面模式
	/**
	 * 其实就是对外封装一个（或多个）接口，确保接口（包括方法名、传参、返回值等）不变，但该接口的具体业务实现可以动态修改，
	 * 以达到底层的业务变动不会影响到上层调用。这就是门面模式。
	 * 
	 * 《设计模式之禅》中使用邮局类（ModenPostOffice）作为门面，但后面又说到门面类不应该有具体的业务实现，
	 * 所以我在最上层定义一个门面类（Facade）去调用邮局类，邮局类在这里作为一个子系统。
	 * 
	 * 项目投产中，门面类接口的定义不宜变动，否则将会出现上层调用大规模修改的局面
	 */
	@Test
	void facadeTest() {

		Facade facade = new Facade();
		String context = "hello,I'm ...";
		String address = "in your heart";
		facade.sendLetter(context, address);
	}

	// 备忘录模式
	/**
	 * 利用一个备忘录类对另一个类的状态做一个备份，方便这个类多次修改状态后能恢复初始化设置
	 * 
	 * 备忘录模式还是比较容易理解的，管理者类还不太理解，以后再求证吧
	 * 
	 * 数据库的事物回滚、数据库数据备份就可以使用备忘录模式去实现。
	 */
	@Test
	void mementoTest() {
		// 声明 出 主角
		Boy boy = new Boy();
		// 声明 出 备忘录 的 管理者
		Caretaker caretaker = new Caretaker();
		// 初始化 当前 状态
		boy.setState(" 心情 很 棒！");
		System.out.println("===== 男孩 现在 的 状态======");
		System.out.println(boy.getState());
		// 需要 记录 下 当前 状态 呀
		caretaker.setMemento(boy.createMemento());

		// 男孩 去 追 女孩， 状态 改变
		boy.changeState();
		System.out.println("\n===== 男孩 追 女孩子 后的 状态======");
		System.out.println(boy.getState());
		// 追 女孩 失败， 恢复 原状
		boy.restoreMemento(caretaker.getMemento());
		System.out.println("\n===== 男孩 恢复 后的 状态======");
		System.out.println(boy.getState());

	}

	// 访问者模式
	/**
	 * 访问者模式是迭代模式的扩充，可以遍历不同的对象，同时还能起到一个拦截器的作用
	 * 
	 * 在以下的例子中，访问者起到了遍历作用员工并打印一份报表的作用，如果需要改变报表的格式，可以实现多个Visitor即可
	 * 
	 * 员工的信息与打印报表的逻辑分开，符合单一职责原则
	 * 
	 * 缺点也很明确，如果增加一个员工角色，或者员工类属性的变动，上层的所有Visitor都要随之变动。
	 */
	@Test
	void visitorTest() {
		for (Employee emp : mockEmployee()) {
			emp.accept(new Visitor());
		}
	}

	// 模拟 出 公司 的 人员 情况， 我们 可以 想象 这个 数据 是 通过 持久 层 传递 过来 的
	public static List<Employee> mockEmployee() {
		List<Employee> empList = new ArrayList<Employee>();
		// 产生 张三 这个 员工
		CommonEmployee zhangSan = new CommonEmployee();
		zhangSan.setJob(" 编写 Java 程序， 绝对 的 蓝领、 苦工 加 搬运工");
		zhangSan.setName(" 张三");
		zhangSan.setSalary(1800);
		zhangSan.setSex(Employee.MALE);
		empList.add(zhangSan);
		// 产生 李四 这个 员工
		CommonEmployee liSi = new CommonEmployee();
		liSi.setJob(" 页面 美工， 审美 素质 太 不流 行了！");
		liSi.setName(" 李四");
		liSi.setSalary(1900);
		liSi.setSex(Employee.FEMALE);
		empList.add(liSi);
		// 再 产生 一个 经理
		Manager wangWu = new Manager();
		wangWu.setName(" 王 五");
		wangWu.setPerformance(" 基本上 是 负值， 但是 我会 拍马屁 呀");
		wangWu.setSalary(18750);
		wangWu.setSex(Employee.MALE);
		empList.add(wangWu);
		return empList;

	}

	// 状态模式
	/**
	 * 状态模式：把状态抽出来封装成一个类，避免类中的方法对状态进行多次的if-else判断，减轻臃肿。
	 * 
	 * 应用场景：一个类中状态牵制动作的需求，可以考虑状态模式
	 */
	@Test
	void stateTest() {
		Lift lift = new Lift();
		lift.setLiftState(Lift.stoppingState);
		lift.open();
		lift.close();
		lift.run();
		lift.stop();
	}

	// 解释器模式
	/**
	 * 用于处理发生频率比较高的需求，如：计算表达式。
	 * 
	 * 一般不自己手动实现，可以借助已经实现了的工具： Expression4J、 MESP（ Math Expression String Parser）、
	 * Jep 等 开源 的 解析 工具包
	 */
	@Test
	void interpreterTest() {
		// 表达式
		String expStr = "a+b+c-d";
		// 赋值
		HashMap<String, Integer> var = new HashMap<String, Integer>();
		var.put("a", 1);
		var.put("b", 2);
		var.put("c", 3);
		var.put("d", 4);
		Calculator cal = new Calculator(expStr);
		System.out.println(" 运算 结果 为：" + expStr + "=" + cal.run(var));

	}

	// 享元模式
	/**
	 * 把创建好的对象存到池中，以便重复使用。它主要解决的对象的共享问题，如何建立多个可共享的细粒度对象则是其关注的重点。
	 * 
	 * 享元模式和单例模式有些相似，享元模式中，池中的一个对象对应一个单例模式。
	 * 
	 * 既然一个对象可以重复利用，高并发的问题也是必然需要我们去关注的。
	 */
	@Test
	void flyweightTest() {
		// 初始化 对象 池
		for (int i = 0; i < 4; i++) {
			String subject = "科目" + i;
			// 初始化 地址
			for (int j = 0; j < 30; j++) {
				String key = subject + "考试地点" + j;
				SignInfoFactory.getSignInfo(key);
			}
		}
		SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");

	}

	// 桥梁模式
	/**
	 * 把继承（强关联）变为聚合（弱关系）
	 * 对于 比较 明确 不发 生 变化 的， 则 通过 继承 来 完成； 
	 * 若不 能 确定 是否 会 发生 变化 的， 那就 认为是 会 发生 变化， 则 通过 桥梁 模式 来 解决， 这才 是一 个 完美 的 世界。
	 * 
	 * 如father，son，grandson中，grandson继承son继承father，father中有一个方法eat()，如果son想修改，必定会对grandson造成影响。
	 * 使用桥梁模式优化：定义一个抽象类，抽象类中有eat()的具体实现，father，son，grandson都继承该抽象类，这时son想修改eat()，都不会对grandson产生影响。
	 * 
	 * 我想：这里的“桥”，就是实现类与抽象类的extends/implement吧
	 */
	@Test
	void bridgeTest() {
		House house = new House();
		System.out.println("------- 房地产 公司 是 这样 运行 的-------");
		// 先 找到 房地产 公司
		HouseCorp houseCorp = new HouseCorp(house);
		// 看 我怎 么 挣钱
		houseCorp.makeMoney();
		System.out.println("\n");
		// 山寨 公司 生产 的 产品 很多， 不过 我 只要 指定 产品 就成 了
		System.out.println("------- 山寨 公司 是 这样 运行 的-------");
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPad());
		shanZhaiCorp.makeMoney();

	}

}

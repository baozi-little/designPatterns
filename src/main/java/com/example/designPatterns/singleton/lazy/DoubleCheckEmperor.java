package com.example.designPatterns.singleton.lazy;

public class DoubleCheckEmperor {

	private DoubleCheckEmperor() {
		super();
	}

	private static DoubleCheckEmperor emperor;

	/**
	 * sync 双重校验
	 * 作用：如果直接在方法名使用synchronized修饰，会使得每次调用该方法都加锁，性能消耗大；双重校验：第一个if为true的时候（第一次调用）才会加锁，性能得到优化。
	 * 第二个if的作用：由于方法没有加锁，当多个线程同时调用该方法时，并且都通过了第一个if，则只有第一个进入锁的线程能创建实例，后面进来的线程不会多次创建实例。
	 * 
	 * 
	 * @return
	 */
	public static DoubleCheckEmperor getInstance() {

		if (emperor == null) {
			synchronized (DoubleCheckEmperor.class) {
				if (emperor == null) {
					emperor = new DoubleCheckEmperor();
				}
			}
		}

		return emperor;
	}

	public void say() {
		System.out.println("I'm emperor !");
	}
}

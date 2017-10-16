package com.tp.objectsclasses.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton tmp = Singleton.getInstance();
		Singleton tmp2 = Singleton.getInstance();
		tmp.demoMethod();
		tmp2.demoMethod();
	}
}

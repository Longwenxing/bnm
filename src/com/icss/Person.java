package com.icss;

public class Person {
	//银行卡余额
	static int yuE;
	//姓名
	String name;
	public Person(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		Person p1 = new Person("小强");
		Person p2 = new Person("翠花");
		p1.yuE = 5000;
		p2.yuE -=500;
		System.out.println(p1.name+"的余"+p1.yuE);
		System.out.println(p2.name+"的余"+p2.yuE);
	}

}

package com.icss;

public class Person {
	//���п����
	static int yuE;
	//����
	String name;
	public Person(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		Person p1 = new Person("Сǿ");
		Person p2 = new Person("�仨");
		p1.yuE = 5000;
		p2.yuE -=500;
		System.out.println(p1.name+"����"+p1.yuE);
		System.out.println(p2.name+"����"+p2.yuE);
	}

}

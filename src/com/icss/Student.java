package com.icss;

public class Student {
	String name;
	String sex;
	int age;
	public Student(){
		this.name = null;
		this.sex = null;
		this.age = 0;
	}
//	public Student(String name,String sec,int age){
//		this.name = name;
//		this.sex = sex;
//		this.age = age;
//	}
//	public void printShow(){
//		System.out.println("我叫："+this.name+"性别："+sex+"今年："+age+"岁了");
//	}
	public static void main(String[] args) {
		Student s1 =new Student();
//		s1.printShow();
//		Student s2 = new Student("张三", "男", 18);
//		s2.printShow();
	}

}

package com.icss;

public class StaticTest {
	static int a;
	int b;
	StaticTest(){
		this.b = 10;
		System.out.println("构造方法被执行了。。。。"+b);
	}
	//成员代码块:初始化成员变量
	{
		b = 50;
		System.out.println("构造代码块被执行了。。。。"+b);
	}
	//静态代码块:初始化静态变量
	static{
		a=100;
		System.out.println("静态代码块被执行了。。。。。"+a);
	}
	public static void main(String[] args) {
		//局部代码块：当有些代码，只执行一次，再也不用了的情况下就用使用局部代码块
		{
			
		}
		System.out.println(a);
		StaticTest t =new StaticTest();
		System.out.println(t.b);
	}

}

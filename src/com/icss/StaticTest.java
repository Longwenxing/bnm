package com.icss;

public class StaticTest {
	static int a;
	int b;
	StaticTest(){
		this.b = 10;
		System.out.println("���췽����ִ���ˡ�������"+b);
	}
	//��Ա�����:��ʼ����Ա����
	{
		b = 50;
		System.out.println("�������鱻ִ���ˡ�������"+b);
	}
	//��̬�����:��ʼ����̬����
	static{
		a=100;
		System.out.println("��̬����鱻ִ���ˡ���������"+a);
	}
	public static void main(String[] args) {
		//�ֲ�����飺����Щ���룬ִֻ��һ�Σ���Ҳ�����˵�����¾���ʹ�þֲ������
		{
			
		}
		System.out.println(a);
		StaticTest t =new StaticTest();
		System.out.println(t.b);
	}

}

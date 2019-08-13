package com.icss;

public class Test1 {
	public static void main(String[] args) {
		Student1 s1 = new Student1("张三", 30);
		Student1 s2 = new Student1("李四", 40);
		Student1 s3 = new Student1("王五", 50);
		Student1[] arr = { s1, s2, s3 };
		
		String name = m1(arr);
		System.out.println(name);
		double age = m2(arr);
		System.out.println(age);
		m3(arr);
	}
	public static void m3(Student1[] arr){
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].age > m2(arr)) {
				System.out.println(arr[i].name+arr[i].age);
			}
		}
	}
	public static double m2 (Student1[] arr){
		int a=arr[0].age+arr[1].age+arr[2].age;
		return a / 3;
		
	}
	public static String m1(Student1[] arr){
		if (arr[0].age>arr[1].age&& arr[0].age>arr[2].age) {
			return arr[0].name;
		}else if (arr[1].age>arr[2].age) {
			return arr[1].name;
		}else {
			return arr[2].name;
		}
		
	}
}

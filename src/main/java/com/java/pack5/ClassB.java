package com.java.pack5;

public class ClassB {
	int meth(int a) {
		return 10-a;
	}
	public static void main(String[] args) {
		ClassB obj = new ClassB();
		System.out.println(obj.meth(20));
	}
}

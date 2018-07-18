package com.mouli.functionalinterface;

public interface Interface2 {

	static void m1() {
		System.out.println("this is static method in interface2");
	}
	
	default void m2() {
		System.out.println("this is default method in interface2");
	}
}

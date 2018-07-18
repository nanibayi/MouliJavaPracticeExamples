package com.mouli.functionalinterface;

public interface Interface1 {

	static void m1() {
		System.out.println("this is static method in interface1");
	}
	
	default void m2() {
		System.out.println("this is default method in interface1");
	}
}

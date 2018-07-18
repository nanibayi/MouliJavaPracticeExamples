package com.mouli.functionalinterface;

public class TestClass implements Interface1, Interface2 {

	/*
	 * (non-Javadoc)
	 * @see com.mouli.functionalinterface.Interface1#m2()
	 * 
	 * If one class is implemented the 2 interfaces and those interfaces has same default method. then class should provide implementation for either of interface common default method
	 * 
	 * If both interfaces has different default methods then calss cann't be override the default methods in interface
	 */
	public void m2() {
		System.out.println("class provided implementation for either of interfaces");
	}
	
	public static void main(String[] args) {
		new TestClass().m2();
	}

}

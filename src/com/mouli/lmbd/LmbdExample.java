package com.mouli.lmbd;

public class LmbdExample {

	public static void main(String[] args) {
	
		ILmbdFunctionalExampleWithoutParam exampleWithoutParam = () -> System.out.println("This is Lmabda implementation for functional interface. For lambda expressions, funcitional interface should be there, Functional inetrface is nothing but interface will have single methodFas");
		exampleWithoutParam.m1();

		ILmbdFunctionalExampleWithParam exampleWithParam = (a, b) -> System.out.println("sum of a and b is : " + (a + b));    // not need to decler datatypes. here. compiler will identify the data types based on context of the inputs to method
		exampleWithParam.m1(2, 5); 
	}

}
package com.mouli.foreach;

import java.util.function.Consumer;

public class MyCosumer implements Consumer<String> {
	public void accept(String t) {
		System.out.println("this is seperate implementation for consumer interface  = " + t);

	}
}

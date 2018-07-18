package com.mouli.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class ForeachExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("mouli");
		list.add("nani");
		list.add("chandra");
		list.add("naga");
		Objects.requireNonNull(list, "List should not be null");
		list.forEach(new Consumer<String>() {

			public void accept(String t) {
				System.out.println("this is anonymous implementation of cosumer interface   = " + t);

			}

		});

		System.out.println("===========================");

		list.forEach(new MyCosumer());

		System.out.println("===========================");

		list.forEach((t) -> {
			System.out.println("this is cosumer interface implementation with Lambda expression = " + t);
		});

	}
}

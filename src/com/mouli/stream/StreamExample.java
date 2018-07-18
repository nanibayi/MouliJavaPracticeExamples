package com.mouli.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 100; i++)
			list.add(i);

		Stream<Integer> sequentialStream = list.stream();
		Stream<Integer> parallelStream = list.parallelStream();

		Stream<Integer> highnumSeq = sequentialStream.filter(p -> p > 90);
		highnumSeq.forEach(p -> System.out.println("high nums Seq : " + p));

		System.out.println("================================");

		Stream<Integer> highnums = parallelStream.filter(p -> p > 90);
		highnums.forEach(p -> System.out.println("high nums : " + p));

		System.out.println(" <----------- All above code lines are written as sigle code line ------------>");

		list.stream().filter(p -> p > 80).forEach(p -> System.out.println("high sequntial nums = " + p));

	}
}

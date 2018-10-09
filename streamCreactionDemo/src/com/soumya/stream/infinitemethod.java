package com.soumya.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class infinitemethod {
	public static void main(String[] args) {
		Stream<Integer>iterate=Stream.iterate(0, i->i+2);
	List<Integer>collect=iterate.limit(1000).collect(Collectors.toList());
	collect.forEach(System.out::println);
	}
}

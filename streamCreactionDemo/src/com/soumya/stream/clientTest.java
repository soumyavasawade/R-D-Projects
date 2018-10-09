package com.soumya.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class clientTest {
	public static void main(String[] args) {
		String arr[]=new String[] {"a","b","c"};
		Stream<String> stream=Arrays.stream(arr);
		stream.forEach(System.out::println);
		Stream<String> of=Stream.of("aa","bb","cc");
		of.forEach(System.out::println);
	}
}

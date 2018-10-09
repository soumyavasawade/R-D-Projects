package com.soumya.stream;

import java.util.stream.IntStream;

public class range {

	public static void main(String[] args) {
		IntStream range=IntStream.range(1,9);
		range.forEach(System.out::println);
	}

}

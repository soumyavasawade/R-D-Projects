package com.soumya.stream;

import java.util.stream.Stream;

public class build {

	public static void main(String[] args) {
		Stream<String> build = Stream.<String>builder().add("sou").add("shilu").build();
		build.forEach(System.out::println);
		System.out.println("-----------------");
		Stream<String> limit = Stream.generate(() -> "hello").limit(10);
		build.forEach(System.out::println);
	}

}

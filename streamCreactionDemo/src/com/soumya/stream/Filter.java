package com.soumya.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
	public static void main(String[] args) {
		List<String>collect=Stream.of("a","b","c").filter(e->e.contains("b")).collect(Collectors.toList());
	Optional<String>findAny=collect.stream().findAny();
	System.out.println(findAny.get());
	Optional<String>findFirst=collect.stream().findFirst();
	System.out.println(findFirst.get());
	}
}

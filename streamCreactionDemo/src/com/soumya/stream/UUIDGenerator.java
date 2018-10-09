package com.soumya.stream;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UUIDGenerator {

	public static void main(String[] args) {
		Supplier<UUID> randomUUID=UUID::randomUUID;
		Stream<UUID>generate=Stream.generate(randomUUID);
		List<UUID>collect=generate.skip(10).limit(30).collect(Collectors.toList());
		collect.forEach(System.out::println);		

	}

}

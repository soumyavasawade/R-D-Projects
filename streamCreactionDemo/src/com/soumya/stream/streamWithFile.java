package com.soumya.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class streamWithFile {

	public static void main(String[] args) {
Path path=Paths.get("test.txt");
try(Stream<String>lines=Files.lines(path)){
	lines.forEach(System.out::println);
}
catch(IOException e) {
	e.printStackTrace();
}
	}

}

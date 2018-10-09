package com.soumya.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class client {
public static void main(String[] args) {
	List<Student> list=new ArrayList<>();
	list.add(new Student("soumya",22));
	list.add(new Student("shilpa",25));
	list.add(new Student("suhas",24));
	Stream<Student>parallelStream=list.parallelStream();
	parallelStream.forEach(i->doprocess(i));
}
public static void doprocess(Student i) {
	System.out.println(i);
}
}

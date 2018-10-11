package com.soumyav.mockito.mockitodemo;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {
	public List<String>retrieveTodos(String user){
		return Arrays.asList("learn spring","learn spring me","learn dance");
	}

}

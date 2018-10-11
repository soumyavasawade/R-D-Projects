package com.soumyav.mockito.mockitodemo;

import java.util.ArrayList;
import java.util.List;

public class TodoBusiness {
	private TodoService todoService;
	public TodoBusiness( TodoService todoService) {
		this.todoService=todoService;
	}
	public List<String>retrieveTodosRelatedToSpring(String user){
		List<String>filteredTodos=new ArrayList<String>();
		List<String>todos=todoService.retrieveTodos(user);
		for(String todo:todos) {
			if(todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
	
}

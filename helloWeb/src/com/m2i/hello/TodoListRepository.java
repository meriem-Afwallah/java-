package com.m2i.hello;

import java.util.ArrayList;

public class TodoListRepository {

	public ArrayList<Todo> findTodoListById(int todoListId){
		if(todoListId == 1) {
			
			ArrayList<Todo> todoList = new ArrayList<>();
			todoList.add(new Todo("Apprendre JAVA"));
			todoList.add(new Todo("Apprendre JAVA EE"));
			
		
			return todoList;
		} else if(todoListId == 2) {
		
			ArrayList<Todo> todoList = new ArrayList<>();
			todoList.add(new Todo("Apprendre JAVA"));
			todoList.add(new Todo("Apprendre HTML"));
			todoList.add(new Todo("Apprendre CSS"));
			todoList.add(new Todo("Faire un projet web"));
	
			return todoList;
		   } else {
			   return null;   
		   }
		
		
	}
		
}

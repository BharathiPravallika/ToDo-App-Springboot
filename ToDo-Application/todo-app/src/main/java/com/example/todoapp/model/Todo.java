package com.example.todoapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String todo;
	private String status;
	private String priority;
	
	//Constructors, Getters, and setters
	public Todo() {
		
	}
	
	public Todo(int id, String todo, String status, String priority) {
		this.id = id;
		this.todo = todo;
		this.status = status;
		this.priority = priority;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
		
}
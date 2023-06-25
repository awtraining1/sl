package com.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Todo {
	
	private String userId;
	int id;
	private String title;
	boolean completed;

	public Todo() {
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return this.id + " , " + this.title + " , " + this.completed;
	}
}

//{
//	  "userId": 1,
//	  "id": 1,
//	  "title": "delectus aut autem",
//	  "completed": false
//	}
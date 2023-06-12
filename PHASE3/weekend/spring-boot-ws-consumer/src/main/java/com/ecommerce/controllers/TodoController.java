package com.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.entity.Todo;

@Controller
public class TodoController {

	@GetMapping("/todo")
	@ResponseBody
	public String index(@RequestParam String id) {

		RestTemplate restTemplate = new RestTemplate();		

		Todo todo1 = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/"+id, Todo.class);
		return todo1.toString();

	}

}

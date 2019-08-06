package com.rakuten.internship;

import java.util.List;

import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping("/")
    public String home(Model model) {
        List<Todo> todos = service.findTodos();
        model.addAttribute("todos", todos);
        return "home";
    }

    @GetMapping("/create")
    public String create() {
        return "create";
    }
}

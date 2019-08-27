package com.rakuten.internship.controller;

import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * このクラスは、ウェブアプリケーションの挙動を制御するためのコントローラークラスです。。
 * コントローラーとして使えるように、コードを記入してください。
 */
@Controller
@RequestMapping ("/")
public class TodoController {
    @Autowired
    private TodoService todoService;
    
    @GetMapping
    public String index(Model model) {
        List<Todo> todos = todoService.findAll();        
        model.addAttribute("todos", todos);
        return "home"; 
    }


    @GetMapping("create")
    public String createTodo(Model model) {
        return "create";
    }
    
    @PostMapping("/create")
    public String createTodo(@ModelAttribute Todo todo) {
        // TODO 必要なコードを作成してください。
        todoService.save(todo);
        return "complete";
    }

    
}

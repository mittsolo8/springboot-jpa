package com.rakuten.internship.controller;

import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.service.TodoService;
import com.rakuten.internship.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * このクラスは、ウェブアプリケーションの挙動を制御するためのコントローラークラスです。。
 * コントローラーとして使えるように、コードを記入してください。
 */
@Controller
@RequestMapping ("/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;
    
    @GetMapping("/")
    public String home(Model model) {
        // TODO 必要なコードを作成してください。
        return null;
    }

    @GetMapping("/create")
    public String create() {
        // TODO 必要なコードを作成してください。
        return null;
    }

    @PostMapping("/create")
    public String createTodo(@ModelAttribute Todo todo) {
        // TODO 必要なコードを作成してください。
        return null;
    }
    
    
    
}

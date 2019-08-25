package com.rakuten.internship.controller;

import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.service.TodoService;
//import com.rakuten.internship.repository.TodoRepository;

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
    
    @GetMapping
    public String home(Model model) {
         List<Todo> players = todoService.findAll();
        model.addAttribute("players", players);
        return "todo/home"; 
        
    }
    

    @GetMapping("new")
    public String newTodo(Model model) {
        return "todo/new";
    }
    
    @GetMapping("{id}/edit")
    public String edit(@PathVariable Long id, Model model) { 
        Todo todo = todoService.findOne(id);
        model.addAttribute("todo", todo);
        return "todo/edit";
    }
    @GetMapping("{id}")
    public String show(@PathVariable Long id, Model model) {
        Todo todo = todoService.findOne(id);
        model.addAttribute("todo", todo);
        return "todo/show";
    }
    @PostMapping
    public String create(@ModelAttribute Todo todo) { 
        todoService.save(todo);
        return "redirect:/todo"; 
    }    
    @PutMapping("{id}")
    public String update(@PathVariable Long id, @ModelAttribute Todo todo) {
        todo.setId(id);
        todoService.save(todo);
        return "redirect:/todo";
    }
    @DeleteMapping("{id}")
    public String destroy(@PathVariable Long id) {
        todoService.delete(id);
        return "redirect:/todo";
    }
    /*
    @PostMapping("/create")
    public String createTodo(@ModelAttribute Todo todo) {
        // TODO 必要なコードを作成してください。
        return null;
    }
     */  
    
    
}

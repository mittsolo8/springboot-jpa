package com.rakuten.internship;

import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.service.TodoService;
import com.rakuten.internship.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



/**
 * このクラスは、ウェブアプリケーションの挙動を制御するためのコントローラークラスです。。
 * コントローラーとして使えるように、コードを記入してください。
 */
@Controller
public class TodoController {
    @Autowired
    TodoRepository repository;
    
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

package com.rakuten.internship.service;


import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.repository.TodoRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * このクラスは、データベースとのトランザクションをサポートするサービスクラスです。。
 */
@Service
@Transactional
public class TodoService {
    @Autowired
    private 

  

    public List<Todo> findTodos(){
        // TODO 必要なコードを作成してください。
        return null;
    }

    public Todo save(Todo todo) {
        // TODO 必要なコードを作成してください。
        return null;
    }
}
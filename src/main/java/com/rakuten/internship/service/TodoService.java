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
    private TodoRepository todoRepository;
  /*
    public List<Todo> findTodos(){
        return todoRepository.findTodos();
    }
*/

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }
    /*
    public Todo findOne(Long id){
        return todoRepository.findOne(id);
    }
    */
  
    public Todo save(Todo todo) {
        
        return todoRepository.save(todo);
    }
    /*
    public void delete(Integer id){
        todoRepository.delete(id);
    }
    */
    
}
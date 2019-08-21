package com.rakuten.internship.repository;

import com.rakuten.internship.entity.Todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * このクラスは、データベースとアクセスするためのリポジトリークラスです。
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    public List<Todo> findByDoneOrderByTitleAsc(boolean done);
    
}
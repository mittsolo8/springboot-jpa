package com.rakuten.internship.form;

import java.util.List;
import com.rakuten.internship.entity.Todo;

public class TodoForm{
    private boolean isDone;
    
    private List<Todo> todoItems;

    public List<Todo> getTodoItems() {
        return todoItems;
}
  public void setTodoItems(List<Todo> todoItems) {
        this.todoItems = todoItems;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

}
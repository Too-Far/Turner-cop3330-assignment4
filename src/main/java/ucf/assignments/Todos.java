package ucf.assignments;
import java.util.ArrayList;
import java.util.List;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Ryan Turner
 */


public class Todos<ArrayTodo> extends Todo {
    private String todo;
    private ArrayTodo todosArray;
    /*
     *  Class that handles basic todo CRUD operations
     *  getTodos will return the array of todos
     *  createList will create a list of todos
     * etc....
     */

    public String getTodos() {
        return todos;
    }

    public void createList(String todos) {
        this.todo = todos;
    }

    public ArrayTodos<String> todoArray() {
        return todoArray;
    }

    public void setTodoArray(TodoArray<String> ArrayTodos) {
        this.ArrayTodos = ArrayTodos;
    }

    public void addTodo(String newTodo){
        getArrayTodos().add(newTodo);
    }
}
}

package main.java.storage;

import main.java.dtos.ToDoListItemDTO;

import java.util.ArrayList;
import java.util.List;

public class InMemoryListStorage implements ListStorage{
    /*
        What's wrong with this class from a future maintenance
perspective?
    */

    private List<ToDoListItemDTO> items;

    public InMemoryListStorage(List<ToDoListItemDTO> items) {
        this.items = items;
    }

    /***
     * Implementation of the ListStorage Interface
     * @return
     */
    @Override
    public List<ToDoListItemDTO> getItems() {
        return items;
    }
}
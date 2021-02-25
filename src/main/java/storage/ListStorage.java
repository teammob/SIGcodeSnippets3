package main.java.storage;

import main.java.dtos.ToDoListItemDTO;
import java.util.List;

public interface ListStorage {
    List<ToDoListItemDTO> getItems();
}

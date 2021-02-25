package main.java.app;

import main.java.dtos.ToDoListItemDTO;
import main.java.notifications.ListContentsChangeNotifier;
import main.java.storage.InMemoryListStorage;
import main.java.storage.ListStorage;

import java.util.List;

public class ToDoList {

    /*
      What changes are needed in this class to make other storage
mechanisms (e.g. filesystem storage) easy to integrate?
    */
    /* We need to map to Interface for future implementation*/
    private ListStorage inMemoryListStorage;
    private ListContentsChangeNotifier changeNotifier;

    public ToDoList(ListStorage inMemoryListStorage) {
        this.inMemoryListStorage = inMemoryListStorage;
        this.changeNotifier = new ListContentsChangeNotifier();
    }

    public void storeItem(ToDoListItemDTO item) {
        inMemoryListStorage.getItems().add(item);
        changeNotifier.sendEmail();
    }
    public List<ToDoListItemDTO> getAllItems() {
        return inMemoryListStorage.getItems();
    }
}


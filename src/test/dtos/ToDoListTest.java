package test.dtos;

import main.java.app.ToDoList;
import main.java.dtos.ToDoListItemDTO;
import main.java.storage.InMemoryListStorage;
import org.junit.Test;

import static org.mockito.Mockito.*;

class ToDoListTest {
    /*
        Is this a useful test? Why (not)? How would you improve it?
*/
    @Test
    void testStoreNewToDoListItemDTO() {
        InMemoryListStorage mockListStorage =
                mock(InMemoryListStorage.class);
        ToDoList toDoList = new ToDoList(mockListStorage);
        ToDoListItemDTO item = new ToDoListItemDTO();
        item.setId("1");
        item.setContent("aap");
        toDoList.storeItem(item);
        verify(mockListStorage, times(1)).getItems();
    }
}
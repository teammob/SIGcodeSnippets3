package test.dtos;

import main.java.app.ToDoList;
import main.java.dtos.ToDoListItemDTO;
import main.java.storage.ListStorage;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

class ToDoListTest {
    /*
        Is this a useful test? Why (not)? How would you improve it?
*/
    @Test
    void testStoreNewToDoListItemDTO() {
        ListStorage mockListStorage =
                mock(ListStorage.class);
        ToDoList toDoList = new ToDoList(mockListStorage);
        ToDoListItemDTO item = new ToDoListItemDTO("1","aap");
        toDoList.storeItem(item);
        verify(mockListStorage, times(1)).getItems();
    }

    @Test
    public void testToDoListItemDTO(){
        ToDoListItemDTO testDTO= new ToDoListItemDTO("11","app2");
        assertEquals(testDTO.getId(),"11");
        assertEquals(testDTO.getContent(),"app2");
    }


}
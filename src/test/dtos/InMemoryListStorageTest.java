package test.dtos;

import main.java.dtos.ToDoListItemDTO;
import main.java.storage.InMemoryListStorage;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class InMemoryListStorageTest {

    ToDoListItemDTO testItems= mock(ToDoListItemDTO.class);

    @Test
    public void testInMemoryListStorage(){
        List<ToDoListItemDTO> testList = new ArrayList<>();
        testList.add(testItems);
        InMemoryListStorage testInMemoryListStorage= new InMemoryListStorage(testList);
        verify(testInMemoryListStorage,times(1)).getItems();
    }
}

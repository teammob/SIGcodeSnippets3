package test.dtos;

import main.java.notifications.ListContentsChangeNotifier;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class ListContentsChangeNotifierTest {

    ListContentsChangeNotifier testClass = mock(ListContentsChangeNotifier.class);

    @Test
    public void testListContentsChangeNotifier(){
        doNothing().when(testClass).sendEmail();
        verify(testClass,times(1)).sendEmail();
    }
}

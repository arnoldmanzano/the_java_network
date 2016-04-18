import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CommandInterfaceTest {

    private CommandInterface cmdInterface;
    private User userMock = mock(User.class);
    private UserCollection userCollectionMock = mock(UserCollection.class);
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut(new PrintStream(outContent));
        cmdInterface = new CommandInterface();
        cmdInterface.setUserCollection(userCollectionMock);
    }

    @Test
    public void userCommandTest() throws Exception {
        cmdInterface.userCommand("user myUserName");
        verify(userCollectionMock, times(1)).findOrCreateUser("myUserName");
        assertEquals(outContent.toString(), "Logged in as myUserName\n");
    }

    @Test
    public void postCommandTest() throws Exception {
        when(userCollectionMock.findOrCreateUser(anyString())).thenReturn(userMock);
        cmdInterface.userCommand("user myUserName");
        cmdInterface.postCommand("post my message");
        verify(userMock, times(1)).addPost("my message");
        assertThat(outContent.toString(), containsString("Message posted successfully\n"));
    }
}
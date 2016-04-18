import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CommandInterfaceTest {

    private CommandInterface cmdInterface;
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
}
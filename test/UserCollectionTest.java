import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class UserCollectionTest {

    private UserCollection userCollection;
    private User userMock = mock(User.class);

    @Before
    public void setup() {
        userCollection = spy(new UserCollection());
        when(userCollection.makeUser(anyString())).thenReturn(userMock);
    }

    @Test
    public void createUserTest() throws Exception {
        assertTrue(userCollection.getUsers().isEmpty());
        userCollection.createUser("new_user_1");
        assertFalse(userCollection.getUsers().isEmpty());
    }

    @Test
    public void findUserTest_findExistingUser() throws Exception {
        userCollection.createUser("old_user");
        userCollection.createUser("new_user");
        when(userMock.getName()).thenReturn("old_user");
        User userToFind = userCollection.findUser("old_user");
        assertEquals(userToFind, userMock);
    }

    @Test
    public void findOrCreateUserTest_createNewUser() throws Exception {
        assertTrue(userCollection.getUsers().isEmpty());
        userCollection.findOrCreateUser("new_user_1");
        assertFalse(userCollection.getUsers().isEmpty());
    }

    @Test
    public void findOrCreateUserTest_findExistingUser() throws Exception {
        userCollection.createUser("old_user");
        when(userMock.getName()).thenReturn("old_user");
        User userToFind = userCollection.findOrCreateUser("old_user");
        assertEquals(userToFind, userMock);
        assertEquals(userCollection.getUsers().size(), 1);
    }
}
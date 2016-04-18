import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserCollectionTest {

    UserCollection userCollection;

    @Before
    public void setup() {
        userCollection = new UserCollection();
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
        User userToFind = userCollection.findUser("old_user");
        assertEquals(userToFind.getName(), "old_user");
    }

}
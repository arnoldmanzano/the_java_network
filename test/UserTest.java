import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

public class UserTest {

    @Test
    public void addPostTest() throws Exception {
        User user = new User("my_username");
        assertTrue(user.getPosts().isEmpty());
        user.addPost("post message");
        assertFalse(user.getPosts().isEmpty());
    }

    @Test
    public void addFollowingTest() throws Exception {
        User userToFollow = new User("userToFollow");
        User user = new User("myUserName");
        user.addFollowing(userToFollow);

        ArrayList<User> expectedCollection = new ArrayList<>();
        expectedCollection.add(userToFollow);
        assertEquals(user.getFollowing(), expectedCollection);
    }
}
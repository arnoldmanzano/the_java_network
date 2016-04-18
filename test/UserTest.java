import static org.junit.Assert.*;
import org.junit.Test;

public class UserTest {

    @Test
    public void addPost() throws Exception {
        User user = new User("my_username");
        assertTrue(user.getPosts().isEmpty());
        user.addPost("post message");
        assertFalse(user.getPosts().isEmpty());
    }

}
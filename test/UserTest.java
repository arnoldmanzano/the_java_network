import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by arnold on 16/4/16.
 */
public class UserTest {

    @Test
    public void NewUser() throws Exception {
        User user = new User();
        int[] emptyArray = {};
        assertArrayEquals(emptyArray, user.view_timeline());
    }

}
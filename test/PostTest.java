import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class PostTest {

    @Test
    public void toStringTest() throws Exception {
        Post post = new Post("the message");
        assertThat(post.toString(), containsString("the message"));
    }

}
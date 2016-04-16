/**
 * Created by arnold on 16/4/16.
 */
public class User {

    private int[] posts;

    public User() {
        this.posts = new int[]{};
    }

    public int[] view_timeline() {
        return posts;
    }
}

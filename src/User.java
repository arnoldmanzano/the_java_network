import java.util.ArrayList;

public class User {

    private String name;
    private ArrayList<Post> posts;

    public User(String name) {
        this.posts = new ArrayList<>();
        this.name = name;
    }

    public void addPost(String message) {
        posts.add(new Post(message));
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public String getName() {
        return name;
    }

}

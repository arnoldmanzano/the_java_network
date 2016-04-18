import java.util.ArrayList;

public class User {

    private String name;
    private ArrayList<Post> posts;
    private ArrayList<User> following;

    public User(String name) {
        this.posts = new ArrayList<>();
        this.following = new ArrayList<>();
        this.name = name;
    }

    public void addPost(String message) {
        posts.add(new Post(message));
    }

    public void addFollowing(User user) {
        following.add(user);
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public String getName() {
        return name;
    }

    public ArrayList<User> getFollowing() {
        return following;
    }
}

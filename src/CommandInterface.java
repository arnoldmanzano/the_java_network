import java.util.*;

public class CommandInterface {

    private User currentUser;
    private UserCollection userCollection;

    public void setUserCollection(UserCollection userCollection) {
        this.userCollection = userCollection;
    }

    public void userCommand(String input) {
        String username =  input.split(" ", 2)[1];
        currentUser = userCollection.findOrCreateUser(username);
        System.out.println("Logged in as " + username);
    }

    public void postCommand(String input) {
        String message =  input.split(" ", 2)[1];
        currentUser.addPost(message);
        System.out.println("Message posted successfully");
    }

    public void timelineCommand(String input) {
        String username =  input.split(" ", 2)[1];
        User user = userCollection.findUser(username);
        ArrayList<Post> posts = user.getPosts();
        for(Post post : posts) {
            System.out.println(post.toString());
        }
    }
}

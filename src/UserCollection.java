import java.util.ArrayList;

/**
 * Created by arnold on 17/4/16.
 */
public class UserCollection {

    private ArrayList<User> users;

    public UserCollection() {
        this.users = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User findOrCreateUser(String username) {
        User user = findUser(username);
        if (user == null) user = createUser(username);
        return user;
    }

    public User findUser(String username) {
        for(User user : users) {
            if(user.getName().equals(username)) return user;
        }
        return null;
    }

    private User createUser(String username) {
        User user = new User(username);
        users.add(user);
        return user;
    }

}

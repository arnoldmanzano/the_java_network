import java.util.ArrayList;

public class UserCollection {

    private ArrayList<User> users;

    public UserCollection() {
        this.users = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User findUser(String username) {
        for(User user : users) {
            if(user.getName().equals(username)) return user;
        }
        return null;
    }

    public User createUser(String username) {
        User user = makeUser(username);
        users.add(user);
        return user;
    }

    public User findOrCreateUser(String username) {
        User user = findUser(username);
        if (user == null) user = createUser(username);
        return user;
    }

    public User makeUser(String username) {
        return new User(username);
    }
}

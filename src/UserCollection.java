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
        User user = new User(username);
        users.add(user);
        return user;
    }

}

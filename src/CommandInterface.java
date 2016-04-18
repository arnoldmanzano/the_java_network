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

}

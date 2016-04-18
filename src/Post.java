public class Post {

    private String message;

    public Post(String message) {
        this.message = message;
    }

    private String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return getMessage();
    }

}

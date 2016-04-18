import java.util.Scanner;

public class TheJavaNetworkApp {

    private static CommandInterface cmdInterface;

    public static void main(String[] args) {
        cmdInterface = new CommandInterface();
        System.out.println("Welcome to the_java_network");
        Scanner scanner = new Scanner(System.in);
        String input, command;
        cmdInterface.setUserCollection(new UserCollection());

        do {
            System.out.print("> ");
            input = scanner.nextLine();
            command = input.split(" ")[0];

            if(command.equals("user")) {
                cmdInterface.userCommand(input);
            } else if(command.equals("post")) {
                cmdInterface.postCommand(input);
            } else if(command.equals("timeline")) {
                cmdInterface.timelineCommand(input);
            } else if(command.equals("follow")) {
                cmdInterface.followCommand(input);
            } else if(command.equals("subscriptions")) {
                cmdInterface.subscriptionsCommand();
            }
        } while (!input.equals("exit"));
    }

}

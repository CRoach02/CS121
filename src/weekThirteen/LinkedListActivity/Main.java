package weekThirteen.LinkedListActivity;

public class Main {
    public static void main(String[] args) {
        SocialMediaUser test1 = new SocialMediaUser("user1", "user1@bsu.edu", "1234567890", "User1 info");
        SocialMediaUser test2 = new SocialMediaUser("user2", "user2@bsu.edu", "0123456789", "User2 info");

        test1.addMessage("Message one.");
        test1.addMessage("Message two.");
        test1.addMessage("Message three.");
        test1.displayUserInfo();
        test1.displayUserMessage();
        test1.removeMessage("Message two.");
        test1.displayUserMessage();
        System.out.println();
        test2.addMessage("Message one.");
        test2.addMessage("Message two.");
        test2.addMessage("Message three.");
        test2.displayUserInfo();
        test2.displayUserMessage();
        test2.removeMessage("Message one.");
        test2.displayUserMessage();

    }
}

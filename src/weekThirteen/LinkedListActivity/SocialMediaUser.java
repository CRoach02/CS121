package weekThirteen.LinkedListActivity;

import java.util.LinkedList;

public class SocialMediaUser {
    LinkedList<String> user = new LinkedList<>();
    LinkedList<String> messageList = new LinkedList<>();
    String UserName, email, phoneNumber, bio, messages;
    public SocialMediaUser(String userName, String email, String phoneNumber, String bio){
        this.UserName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.bio = bio;
    }
    public void AddUserInfo(){
        user.add(UserName);
        user.add(email);
        user.add(phoneNumber);
        user.add(bio);
    }
    public void addMessage(String input){
        messageList.add(input);
    }
    public void removeMessage(String input){
        messageList.remove(input);
    }
    public LinkedList<String> getUserInfo(LinkedList<String> user){
        return user;
    }
    public void displayUserMessage(){
        System.out.println(messageList);
    }
    public void displayUserInfo(){
        user.add(UserName);
        user.add(email);
        user.add(phoneNumber);
        user.add(bio);
        System.out.println(user);
    }

}

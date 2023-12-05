package weekTen.AbstractAndInterfaces.InterfaceClasses;

public class UserInteractable implements Interface{

    private int userID, newLikes, likes = 0;
    private String userName;
    public UserInteractable(int userID, int newLikes, String userName){
        this.userID = userID;
        this.newLikes = newLikes;
        this.userName = userName;
    }

    public int getNewLikes() {
        return newLikes;
    }
    public void setNewLikes(int newLikes) {
        this.newLikes = newLikes;
    }
    public int numberOfLikes() {
        return likes+newLikes;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

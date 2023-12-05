package weekTen.AbstractAndInterfaces.InterfaceClasses;

public class AdminInteractable {
    private int userID, newLikes, likesNum;
    private String userName;
    public AdminInteractable(int userID, String userName, int likesNum){
        this.userID = userID;
        this.userName = userName;
        this.likesNum = likesNum;
    }
    public int getNewLikes() {
        return newLikes;
    }
    public void setNewLikes(int newLikes) {
        this.newLikes = newLikes;
    }
    public int numberOfLikes() {
        return likesNum;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

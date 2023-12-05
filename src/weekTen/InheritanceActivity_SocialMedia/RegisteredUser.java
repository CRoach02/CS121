package weekTen.InheritanceActivity_SocialMedia;

public class RegisteredUser extends User{
    private int UserID;

    public RegisteredUser(String userName, String password, String email, int userID) {
        super(userName, password, email);
        this.UserID = userID;
    }
    public int getUserID() {
        return UserID;
    }
    public void setUserID(int userID) {
        UserID = userID;
    }
    @Override
    public String toString(){
        return String.format("Name: %s%nPassword: %s%nEmail: %s%nUserID: %d", getUserName(), getPassword(), getEmail(), getUserID());
    }
}

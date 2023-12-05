package weekTen.AbstractAndInterfaces.AbstractClasses;

public class User extends UserProfile{
    private int userID;
    private boolean admin;

    public User(String UserName, String Password, String Email, int userID, boolean admin){
        super(UserName,Password,Email);
        this.userID = userID;
        this.admin = admin;
    }
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public boolean getAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    @Override
    public String toString(){
        return String.format("Username: %s%nPassword: %s%nEmail: %s%nUser ID: %6d%nAdministrator Status: %b", getUserName(), getPassword(), getEmail(), getUserID(), getAdmin());
    }
    @Override
    public boolean AdminStatus(){
        return admin;
    }
}

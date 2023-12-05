package weekTen.AbstractAndInterfaces.AbstractClasses;

public class Administrator extends UserProfile{
    private boolean admin;
    private int UserID;

    public Administrator(String UserName, String Password, String Email,int UserID, boolean admin){
        super(UserName,Password,Email);
        this.admin = admin;
        this.UserID = UserID;
    }
    public boolean getAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    public int getUserID() {
        return UserID;
    }
    public void setUserID(int userID) {
        UserID = userID;
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

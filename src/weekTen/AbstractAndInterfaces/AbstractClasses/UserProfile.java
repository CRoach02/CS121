package weekTen.AbstractAndInterfaces.AbstractClasses;

public abstract class UserProfile {
    private String UserName, Password, Email;

    public UserProfile(String UserName, String Password, String Email){
        this.UserName = UserName;
        this.Password = Password;
        this.Email = Email;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        this.UserName = userName;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        this.Password = password;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    public String toString(){
        return String.format("Name: %s%nPassword: %s%nEmail: %s", UserName, Password, Email);
    }
    public abstract boolean AdminStatus();
}

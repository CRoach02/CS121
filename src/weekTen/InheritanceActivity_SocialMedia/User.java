package weekTen.InheritanceActivity_SocialMedia;

public class User {
    private String userName, password, email;

    public User(String userName, String password, String email){
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return String.format("Name: %s%nPassword: %s%nEmail: %s", userName, password, email);
    }
}

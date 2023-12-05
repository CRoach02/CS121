package weekTen.InheritanceActivity_SocialMedia;

public class AdminUser extends User{
    private boolean Admin;

    public AdminUser(String userName, String password, String email, boolean admin){
        super(userName, password, email);
        this.Admin = admin;
    }
    public boolean getAdmin(){
        return Admin;
    }
    public void setAdmin(boolean admin) {
        Admin = admin;
    }
    @Override
    public String toString(){
        return String.format("Name: %s%nPassword: %s%nEmail: %s%nAdministrator Status: %s", getUserName(), getPassword(), getEmail(), getAdmin());
    }
}

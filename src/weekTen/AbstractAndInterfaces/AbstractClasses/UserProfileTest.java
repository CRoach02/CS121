package weekTen.AbstractAndInterfaces.AbstractClasses;

public class UserProfileTest {
    public static void main(String[] args) {
        User user1 = new User("John_Doe", "JD1234", "john.doe@gmail.com", 238984, false);
        System.out.println(user1+"\n");
        Administrator AdminUser1 = new Administrator("Jane_Doe", "admin028943", "jane.doe@gmail.com", 100001,true);
        System.out.println(AdminUser1);
    }
}

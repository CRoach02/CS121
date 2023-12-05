package weekTen.InheritanceActivity_SocialMedia;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("dragonBlue", "water$!","google@gamil.com");
        RegisteredUser user2 = new RegisteredUser("dragonRed", "fire$!", "google@gmail.com", 1234);
        AdminUser user3 = new AdminUser("administrator", "admin1234", "admin.google@gmail.com", true);
        System.out.println(user1);
        System.out.println("------------------------------");
        //System.out.println(user1.getUserName());
        //System.out.println(user1.getEmail());
        System.out.println(user2);
        System.out.println("------------------------------");
        System.out.println(user3);

    }
}

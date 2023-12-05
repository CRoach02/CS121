package weekTen.AbstractAndInterfaces.InterfaceClasses;

public class InterfaceTest {
    public static void main(String[] args) {
        UserInteractable user1 = new UserInteractable(233466, 20, "John_Doe");
        AdminInteractable adminUser1 = new AdminInteractable(233466, "John_Doe", 30);
        System.out.printf("Number of likes for %s's post: %d",user1.getUserName(),user1.numberOfLikes());
        System.out.println("\nAdministrator, set number of likes for "+adminUser1.getUserName()+" to "+adminUser1.numberOfLikes());

    }
}

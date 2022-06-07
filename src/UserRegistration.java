import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter valid Last name");
            String lastName = scan.next();
            String regrex = "^[A-Z][a-z]{3,9}$";
            boolean result = lastName.matches(regrex);
            if (result) {
                System.out.println(lastName + " Last Name is valid");
                break;
            } else {
                System.out.println("Name Does not valid Example : Deepake");
            }
        }
    }
}

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter valid first name");
            String firstName = scan.next();
            String regrex = "^[A-Z][a-z]{3,9}$";
            boolean result = firstName.matches(regrex);
            if (result) {
                System.out.println(firstName + " First Name is valid");
                break;
            } else {
                System.out.println("Name Does not valid Example : Viky");
            }
        }
    }
}

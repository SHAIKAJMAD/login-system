import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        // Stored credentials (example)
        String correctUsername = "admin";
        String correctPassword = "1234";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if(username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("✅ Login Successful! Welcome " + username);
        } else {
            System.out.println("❌ Invalid Username or Password!");
        }

        sc.close();
    }
}

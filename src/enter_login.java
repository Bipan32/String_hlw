import java.util.Scanner;

public class enter_login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Username = "";
        String Password = "";

        System.out.println("Sign-up:");
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (Username.equals("")) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            if (password.length() > 8 && password.contains("@")) {
                Username = username;
                Password = password;
                System.out.println("Sign-up successful!");
            } else {
                System.out.println("Password must be at least 8 characters long and contain '@'.");
            }
        } else {
            System.out.println("Username already exists. Please choose a different one.");
        }

        // Login
        System.out.println("\nLogin:");
        System.out.print("  username: ");
        String loginUsername = scanner.nextLine();
        System.out.print(" password: ");
        String loginPassword = scanner.nextLine();

        if (loginUsername.equals(Username) && loginPassword.equals(Password)) {
            System.out.println("Logged in !");
        } else {
            System.out.println("Login failed.");
        }

    }
}
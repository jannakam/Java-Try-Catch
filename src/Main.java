import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validUsername = "Coded";
        String validPassword = "Coded123";
        boolean isLoggedIn = false;

        // FIRST BONUS
//        do {
//            try {
//                System.out.println("Enter a username: ");
//                String inputUser = scanner.nextLine();
//                if (!inputUser.equals(validUsername)) {
//                    throw new Exception("Invalid credentials");
//                }
//
//                System.out.println("Enter a password: ");
//                String inputPass = scanner.nextLine();
//                if (!inputPass.equals(validPassword)) {
//                    throw new Exception("Invalid credentials");
//                }
//
//                isLoggedIn = true;
//                System.out.println("Logged in successfully");
//            }
//            catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        } while (!isLoggedIn);

        // EXTRA BONUS
        for (int i = 0; i < 6; i++) {
            try {
                if (i == 5) {
                    throw new Exception("Exceeded maximum number of attempts. Try again later");
                }
                System.out.println("Enter a username: ");
                String inputUser = scanner.nextLine();
                if (!inputUser.equals(validUsername)) {
                    throw new Exception("Invalid credentials");
                }

                System.out.println("Enter a password: ");
                String inputPass = scanner.nextLine();
                if (!inputPass.equals(validPassword)) {
                    throw new Exception("Invalid credentials");
                }
                isLoggedIn = true;
                System.out.println("Logged in successfully");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}

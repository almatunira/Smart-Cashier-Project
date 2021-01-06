import java.util.Scanner;

public class Login {
    Scanner sc = new Scanner(System.in);
    private static Login uniqueInstance;

    private Login() {}

    public static Login getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Login();
        }
        return uniqueInstance;
    }

    public void getMenu() {
        System.out.println("Login");
        System.out.print("Username: ");
        String uname = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();

        System.out.println("Happy Shopping");
    }

}

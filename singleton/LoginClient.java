public class LoginClient {
    public static void main(String[] args) {

        /* lazy instatiaton */
        Login user = Login.getInstance();
        user.getMenu();
    }
}

import java.util.Scanner;

class InvalidLoginException extends Exception {
    public String getMessage() {
        return "Invalid login details, try again!";
    }
}

class User {
    String username = "admin";
    String password = "pass123";
    String inputUsername, inputPassword;
    
    void acceptInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username:");
        inputUsername = s.nextLine();
        System.out.println("Enter password:");
        inputPassword = s.nextLine();
    }
    
    void verify() throws InvalidLoginException {
        if(username.equals(inputUsername) && password.equals(inputPassword)) {
            System.out.println("Login successful!");
        } else {
            InvalidLoginException ex = new InvalidLoginException();
            System.out.println(ex.getMessage());
            throw ex;
        }
    }
}

class AuthenticationSystem {
    void initiateLogin() {
        User user = new User();
        try {
            user.acceptInput(); // first attempt
            user.verify();
        } catch(Exception e) {
            try {
                user.acceptInput(); // second attempt
                user.verify();
            } catch(Exception a) {
                System.out.println("Account is locked after 2 failed attempts!");
            }
        }
    }
}

public class LoginDemo {
    public static void main(String[] args) {
        AuthenticationSystem auth = new AuthenticationSystem();
        auth.initiateLogin();
    }
}

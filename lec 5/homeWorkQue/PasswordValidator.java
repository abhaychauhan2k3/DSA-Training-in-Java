import java.util.Scanner;
import java.io.Console;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Password : ");
        // String password = sc.next();
        
        //taking secure password
        Console con = System.console();
        char[] passwordArray = con.readPassword("Enter the Password: ");
        String password = new String(passwordArray);

        //checking length :
        if (password.length() > 8 && password.length() < 25){
            if(password.matches(".*[A-Z].*")); {//Regular Expression
                if(password.matches(".*[a-z].*")){
                    if(password.matches(".*[0-9].*")){
                        if (password.matches(".*[^a-zA-Z0-9].*")){
                            System.out.println("its a valid Password");
                        }
                    }
                }
            }
        }
        sc.close();
    }
}


//for regex : use matches function

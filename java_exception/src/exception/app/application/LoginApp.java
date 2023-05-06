package exception.app.application;

import java.util.Scanner;

import exception.app.data.LoginRequest;
import exception.app.exceptions.MyCustomException;
import exception.app.utils.ValidationUtils;

public class LoginApp {
    public static void main(String[] args) {

        //Connect to database
        DatabaseApp.ConnectDB("root", "123");

        Scanner inputScanner = new Scanner(System.in);
    
        try {
            
            System.out.println("======= LOGIN FORM ========");
            System.out.println("Input username:");
            String username = inputScanner.nextLine();
    
            System.out.println("Input password:");
            String password = inputScanner.nextLine();
    
            //Validasi Login
            LoginRequest request = new LoginRequest();
            request.username = username;
            request.password = password;
    
            ValidationUtils.LoginValidate(request);
        
            HomepageApp.HomePage();
    
        }catch (MyCustomException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally {
            inputScanner.close();
        }
    }
}

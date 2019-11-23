import java.io.*;
import java.util.Scanner;
class Logintest{
    
    public void runlogin(){
        Login login = new Login();    
    System.out.println("1.sign in \n2.sign up(create account) \n3.press '0' to exit the program");
    Scanner option = new Scanner(System.in);
    int b = option.nextInt(); 
    
    
     if(b == 0){
        System.exit(0);
    }
    else{
        System.out.println("enter your username: ");
    Scanner sc = new Scanner(System.in);
    String username = sc.nextLine();
    
    
    
    
    Console console = System.console();
    char[] password1 = console.readPassword("enter the password: ");
    
    String password = String.valueOf(password1);
        login.setDetails(username, password);

    if(b == 1){
        login.checkCredentials(username, password);
        //login.checkPassword();
           
        

    }
    else if(b == 2){
        login.signUp(username, password);
    }
    
    }
    
    
    
    
    }
    }

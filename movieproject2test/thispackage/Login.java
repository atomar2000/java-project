import java.io.*;
import java.util.Scanner;

class Login{

    String username;
    String password;
    boolean check = false;
    
    public void setDetails(String username, String password){
    this.username = username;
    this.password = password;
    }
    
    public void checkCredentials(String username , String password){
        File tempFile = new File(username + ".txt");
        
        if(tempFile.exists()){
            BufferedReader br;
            try{
            br = new BufferedReader(new FileReader(username + ".txt"));
            
            String a = br.readLine();
            br.close();
            if(a.equals(password)){
                
                System.out.println("succesfully logged in..");                           
                
            }
            else{
                
                System.out.println("the password entered is incorrect please try again: ");
                System.out.println("enter the password again: ");
                Scanner sc1 = new Scanner(System.in);
                String newPassword = sc1.nextInt();
                this.checkCredentials(this.username, newPassword);
                
            }
            
            
        }
            
            catch(FileNotFoundException e){
                System.out.println(e);
            }
            catch(Exception e){
                System.out.println(e);
    
            }
            
            
        }
            
        
        else {
            System.out.println("you need to create an account first: ");
            System.out.println("enter a new username: ");
            Scanner sc34 = new Scanner(System.in);
            String username1 = sc34.nextLine();
            System.out.println("enter the new password: ");
            Scanner sc29 = new Scanner(System.in);
            String password1 = sc29.nextLine();
            this.signUp(username1, password1);
        }
        
    }

    
    public void signUp(String username, String password){
        File tempFile = new File(username + ".txt");
        if(tempFile.exists()){
            System.out.println("the username already exists..plz try again with a different username: ");
            
        }
        else{
            try{
            tempFile.createNewFile();
            FileWriter fw = new FileWriter(tempFile);
            fw.write(password);
            fw.close();
            System.out.println("sign up succesfully completed");
        
        }
        catch(Exception e){
                System.out.println(e);
        }
    
        }
    }
}

import java.io.*;
import thispackage.*;                            //CUSTOM PACKAGE IMPORT
import java.awt.Desktop;
import java.util.Scanner;
import java.util.Random;
import java.lang.*;

class Theatre{                                      //INNER CLASS
    class Ticket extends MovieTickets{                                    //EXTENDS USED  
        public void checkMovie(String name) throws InvalidMovieException{
            if(!name.equalsIgnoreCase("interstellar") && !name.equalsIgnoreCase("inception"))
            throw new InvalidMovieException(movie);                                                 //THROWS KEYWORD IMPLEMENTATION
            else    
            System.out.println("name of the movie :" + name);
        }

        public void checkCity(String name) throws CityException{
            if(!name.equalsIgnoreCase("Surat") && !name.equalsIgnoreCase("Delhi"))
            throw new CityException("our services are limited to surat and delhi only");   //THROWS KEYWORD USED
            else
            System.out.println("name of the city :" + name);
        }
        
        public void readContent1(String number, String place){
            try {
                BufferedReader Buff = new BufferedReader(new FileReader(place + "\\movie1\\screen1.txt"));
                this.movie = Buff.readLine();
                this.time = Buff.readLine();
                this.price = Buff.readLine();                               //USED FILEREADER
                Buff.close();                                                         //READING FROM THE TXT FILES FROM DIFFERENT DIRECTORIES 
                
            } 
            
            catch (IOException e) {
                System.out.println("the error is caught");                             //EXCEPTION HANDLING FOR THE BUFFEREDREADER
            }
                    
            
                this.number = number;
                this.screen = "screen1";
                System.out.println(" name: " + this.movie + " \n number of tickets: " + this.number + "\n screen: " + this.screen + "\n Show timings: " + this.time);
            
        }
        public void readContent2(String number, String place){
            try {
                BufferedReader Buff = new BufferedReader(new FileReader(place + "\\movie2\\screen2.txt"));
                this.movie = Buff.readLine();
                this.time = Buff.readLine();                                            //THIS. IS USED TO REFER THE CURRENT CLASS OBJECT
                this.price = Buff.readLine();

                Buff.close();                                           //CLOSING BUFFEREDREADER TO PREVENT LEAKAGE OF DATA
            } catch (IOException e) {
                System.out.println("the error is caught");                     //EXCEPTION HANDLING FOR THE BUFFEREDREADER
            }
                    
            
                this.number = number;
                this.screen = "screen2";
                System.out.println(" name: " + this.movie + " \n number of tickets: " + this.number + "\n screen: " + this.screen + "\n Show timings: " + this.time);
            
        }

        public void getBill(String number, String timedec  ){

            this.timedecided = timedec;
            
            String choose = " ABCDEFGHIJ";
            char[] alphabet = choose.toCharArray();            
            int b = Integer.parseInt(number);
            int a = Integer.parseInt(this.price);                           //BILLING METHOD
            int cost = a*b;
            int abn = (int)(Math.random()*((17-1)+1))+1;                    //RANDOMLY GENERATING SEATS
            int index = (int)(Math.random()*((10-1)+1))+1;
            char mn = alphabet[index];

            System.out.println("*********BILL*********");
            System.out.println(" name: " + this.movie + " \n number of tickets: " + this.number + "\n screen: " + this.screen + "\n Show timings: " + this.timedecided);
            if(b > 1)
            System.out.println("your seat numbers are in the range:  "+mn+":"+abn+"  "+mn+":"+(abn+b-1));
            else if(b == 1)
            System.out.println("your seat number is:  "+mn+":"+abn);
            System.out.println("......................");
            System.out.println("total price to be paid: Rs. " + cost);
            System.out.println("thank you for chosing our service...have a nice day!");
            System.out.println("*********BILL*********");            
            

        }

        public void showChoices(){
            File file = new File("newHope.jpg");
            try{
            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);
            }
            catch(Exception e){                        // FILE HANDLING (FILE OPENING)
                    System.out.println("the desktop was unable to open the file");
            }
            
        }
    }
}
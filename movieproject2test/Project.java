import java.io.*;
import thispackage.*;                            //CUSTOM PACKAGE IMPORT
import java.awt.Desktop;
import java.util.Scanner;
import java.util.Random;
import java.lang.*;

class Project extends Thread{
    public static void operations() throws IOException{
        
        Logintest loginhere = new Logintest();
        
        for(;;){
          loginhere.runlogin();
          for(;;){
           

           
           
           
            System.out.println("1.purchase a ticket \n2.exit");
            Scanner sc25 = new Scanner(System.in);
            int option = sc25.nextInt();
            if(option == 1){
        


        System.out.println("enter the name of the city you are from :");
        String Surat = "Surat";String movie1 = "INTERSTELLAR";String movie2 = "INCEPTION";
        String Delhi = "Delhi";String nameOfcity = "";
        Theatre th = new Theatre();
        Theatre.Ticket ticket = th.new Ticket();
        Scanner sc = new Scanner(System.in);
        try{
        nameOfcity = sc.nextLine();
        }
        
        catch(Exception e){                                             //EXCEPTION HANDLED FOR THE WRONG INPUT OF THE CITY
            System.out.println("exception caught");
        }

        try{
            ticket.checkCity(nameOfcity);
        }
        catch(CityException e){
            System.out.println("we only have our cinema halls in surat and delhi at the moment....sorry for the inconvinience caused.");
        }
        ////////////////BELOW THIS IS THE CODE FOR INPUT BY THE USER REGARDING THEIR CHOICES OF THE MOVIE///////////////////////
        
        if(nameOfcity.equalsIgnoreCase(Surat)){
            
            System.out.println("enter the amount of tickets you want to purchase");
            Scanner sc2 = new Scanner(System.in);
            String number = sc2.nextLine();
            System.out.println("movies currently available : \n1.INTERSTELLAR \n2.INCEPTION");
            
            Scanner sc3 = new Scanner(System.in);
            String movie = sc3.nextLine();
            
            try {
                ticket.checkMovie(movie);
            } catch (InvalidMovieException e) {
                System.out.println("the movie you have entered is not currently being screened in any of our theatres.");
            }

            if(movie.equalsIgnoreCase(movie1)){
                ticket.readContent1(number,"surat");
                System.out.println("please confirm the timing you prefer");
                Scanner sc23 = new Scanner(System.in);
                String time = sc23.nextLine();

                ticket.getBill(number, time);
                ticket.showChoices();

            }
            else if(movie.equalsIgnoreCase(movie2)){
                ticket.readContent2(number,"surat");
                System.out.println("please confirm the timing you prefer");
                Scanner sc23 = new Scanner(System.in);
                String time = sc23.nextLine();

                ticket.getBill(number, time);
                ticket.showChoices();
            }
        }
        else if(nameOfcity.equalsIgnoreCase(Delhi)){
            
            System.out.println("enter the amount of tickets you want to purchase");
            Scanner sc2 = new Scanner(System.in);
            String number = sc2.nextLine();
            System.out.println("enter the movie choice : \n1.INTERSTELLAR \n2.INCEPTION");
            
            Scanner sc3 = new Scanner(System.in);
            String movie = sc3.nextLine();
            try {
                ticket.checkMovie(movie);
            } catch (InvalidMovieException e) {
                System.out.println("the movie you have entered is not currently being screened in any of our theatres.");
            }

            if(movie.equalsIgnoreCase(movie1)){
                ticket.readContent1(number,"delhi");
                System.out.println("please confirm the timing you prefer");
                Scanner sc23 = new Scanner(System.in);
                String time = sc23.nextLine();

                ticket.getBill(number, time);
                ticket.showChoices();
            }
            else if(movie.equalsIgnoreCase(movie2)){
                ticket.readContent2(number,"delhi");
                System.out.println("please confirm the timing you prefer");
                Scanner sc23 = new Scanner(System.in);
                String time = sc23.nextLine();

                ticket.getBill(number, time);
                ticket.showChoices();
            }    
        }
    }
    else 
    break; 
  }

    
    
  }


}

public void run() {
    try {
        operations();
    } catch(Exception e) {
        e.printStackTrace();
    }
}
}
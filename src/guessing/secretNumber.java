package guessing;

import java.util.Scanner;
import java.util.Random;

public class secretNumber
{
    public static void main( String[] args)
   {    
        Random r = new Random();
        int secretNumber = 1 + r.nextInt(10);
        System.out.println("Enter your number: ");
        Scanner receiveInput = new Scanner(System.in); 
        int guess=receiveInput.nextInt();
        do {
        
            if(guess<secretNumber){
                System.out.println("Too low, try again. Enter your number: ");
                guess=receiveInput.nextInt();}
        
            if(guess>secretNumber) {
                System.out.println("Too high, try again. Enter your number: ");
                guess=receiveInput.nextInt();}
        } while(guess!=secretNumber);
       
       
        
        
      
        
        
        
        System.out.println("The secret number is " + secretNumber+". Good job!");
        

        
       
        receiveInput.close();
    }
}
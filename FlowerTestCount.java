//Ashley Gutierrez Carreto
//November 7th, 2023
//Lab 10 FlowerCounterTest
//There is a flower shop that sells 5 different types of flowers and have
// prices assign to them. This user can select which number of flower they want
//and the code will ask the quantity then proceeds to calculate the price.
import java.util.Scanner;
public class FlowerTestCount
{   
    public static void main (String [] args)
    {
        FlowerCounter myFlowerCounter = new FlowerCounter();
        //Instantiates the class "FlowerCounter"
        
        
         for (int i=0; i< 5; i++) // print the flower list
        System.out.println (i + " " + myFlowerCounter.price [i]);
        
        System.out.println ("Type the number of the flower you would like "
                          + " to purchase. (Please select one)");
                          
    
          
        Scanner keyboard = new Scanner (System.in);
                
        int flowerPosition = keyboard.nextInt();
        System.out.println ("Client " + flowerPosition + ": "+ 
        myFlowerCounter.price [flowerPosition] + " " 
                              + myFlowerCounter.flowerName[flowerPosition]);
        
      
        
        System.out.println ("How many flowers would you like?");
        
                          
        int quantity = keyboard.nextInt();
        
        double total = quantity * myFlowerCounter.price [flowerPosition];
        
        System.out.println ("Your total is " + total);
        
        
    }
}
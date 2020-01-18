/*
Algorithm
1. Generate 2 random numbers 
2. store them in int variables
3. Display the equator
4. Get user to type in answer
5. Add 2 random number & store


 */
package exercise;

/**
 *
 * @author acastillo4
 */
import java.util.*;
public class Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
    Scanner keyboard = new Scanner(System.in);
    
    Random rand = new Random();
    int a = rand.nextInt(10);
    
    int b = rand.nextInt(10);
    
    
    System.out.println(a +" + " + b);
        
        
    int guess;
    int count = 0;
    int correct = 0;
    int incorrect = 0;
    System.out.println("What is the answer?");
    guess = keyboard.nextInt();  
    
    if (guess== a + b)
    {
     System.out.println("correct!");
     correct++;
        
    }    
     else
    {
     System.out.println("incorrect!");
     incorrect++;
    }  
    
//     count++;
     
     
    System.out.println("You got "+ correct +" correct and "+ incorrect +" incorrect");
   
    
    
    
    
    
    
    
    
    
    
    
    
 
        
    
    
    }
    
}

import java.util.*;
public class MathFunctions
{

   // Implement this method, which prompts the user for a and b, then divides a by b
   // and then calculates a % b.  If the user enters an invalid type of input, or a 
   // zero for the divisor, an Exception will be thrown, both of which need to be caught
   public void divide()
   {
      int num=0;
      int div=0;

      int num1=0;
      int num2=0;

      try
      {
      Scanner input = new Scanner (System.in);
      
      System.out.print("Enter the numerator: ");
       num = input.nextInt();
        
      System.out.print("Enter the divisor: ");
       div = input.nextInt();
      

      num1= num/div;
       num2=num % div;
      System.out.print(num+ " / "+ div+" is "+ num1+" with a remainder of "+ num2);
      
      }
      catch( InputMismatchException ime )
      {
      System.out.println("Invalid input type" +"\n" +"Run the program again");
      }
      catch(ArithmeticException ae   )
      {
      System.out.println("You can't divide "+ num   +" by "+div+  "\n"+ "Run the program again" );

      }
   
   }
   
   public static void main( String[] args )
   {
      // Test it here in main, when ready
      MathFunctions functions = new MathFunctions();
      
      functions.divide();
      
   }
   



}

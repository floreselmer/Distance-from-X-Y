import java.math.BigDecimal;
public class Circle
{
   public BigDecimal findCircleArea( double r )
   {
   
      
      BigDecimal rr = new BigDecimal(r);
      BigDecimal pie = new BigDecimal("3.14159265358979323");
      
      BigDecimal r2 = (rr.multiply(rr));
      BigDecimal answer = (r2.multiply(pie));
      return answer;

   }   
   
   
   public static void main( String[] args )
   {
   
      Circle circle1 = new Circle();
      double radius;
      BigDecimal result;
      String output;
      
      radius = 3.56;
      result = circle1.findCircleArea( radius );
      output = result.toString();
      System.out.println( "The area of a circle with r of " + radius + " is: " );
      System.out.println( output );
      
      System.out.println();
      
      radius = 1.5689;
      result = circle1.findCircleArea( radius );
      output = result.toString();
      System.out.println( "The area of a circle with r of " + radius + " is: " );
      System.out.println( output );        
   }  
}
 import java.io.DataInputStream;

public class CommandAdd
{
   public static void main(String args[]) 
   { 
      DataInputStream in1 = new DataInputStream(System.in);
      int x,y,z;
      try
      {
          System.out.println("Enter first number:");
          x=Integer.parseInt(in1.readLine());
          
          System.out.println("Enter second number:");
          y=Integer.parseInt(in1.readLine());
          
          z=x+y;
          System.out.println("Addition of the numbers:" +z);
      }
      catch(Exception e) 
      {
          System.out.println("Error is:"+e);  
      }       
   }
}
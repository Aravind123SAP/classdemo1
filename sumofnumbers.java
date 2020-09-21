
import java.util.Scanner;


/**
 *
 * @author DELL
 */
public class sumofnumbers {
    public static void main(String[] args){
        
   int num;
   int sum=0;
  Scanner sc = new Scanner(System.in);
System.out.println("Enter a num:");
num = sc.nextInt();
if(num > 0)
{
   for(int i = 1; i<=num; i++)
   { 
      sum = sum+i; 
      System.out.println(i);
   }
}
System.out.println("Sum: " +sum);
}
}
    
            


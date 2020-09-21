
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class grade {
     public static void main(String args[ ])
{
   int t1,t2,t3;
   float avg;
  Scanner sc = new Scanner(System.in);
System.out.println("Enter 3 test scores:");
t1= sc.nextInt();
t2= sc.nextInt();
t3=sc.nextInt();
avg=(t1+t2+t3)/3;
System.out.println("avg is:" +avg);
if(avg>=90 && avg<=100)
{
   System.out.println("A");
}
else if(avg>=80 && avg<=89)
{
System.out.println("B");
}
else if(avg>=70 && avg<=79)
{
  System.out.println("C");
}
else if(avg>=60 && avg<=69)
{
 System.out.println("D");
}
else
{
System.out.println("F");
}
}
}
    


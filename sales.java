
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
public class sales {
       public static void main(String args[ ])
{
   int s1,s2,s3,s4,s5;
  Scanner sc = new Scanner(System.in);
System.out.println("Enter 5 sales:");
s1 = sc.nextInt();
s2=sc.nextInt();
s3=sc.nextInt();
s4=sc.nextInt();
s5=sc.nextInt();
System.out.println("\n Sales bar chart");
System.out.println("\n store1:");
for(int i=0; i<s1;i=i+100)
{
 System.out.print("*");
}
System.out.println("\n store 2:");
for(int i=0; i<s2;i=i+100)
{
 System.out.print("*");
}
System.out.println("\n store 3:");
for(int i=0; i<s3;i=i+100)
{
 System.out.print("*");
}
System.out.println("\n store 4:");
for(int i=0; i<s4;i=i+100)
{
 System.out.print("*");
}

System.out.println("\n store 5:");
for(int i=0; i<s5;i=i+100)
{
 System.out.print("*");
}
}
}
    


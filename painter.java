
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
public class painter {

    public static void main(String args[ ])
{
   double paintCost = 0;
   int rooms = 0;
   int wallSquareFeet = 0;
   int totalSquareFeet = 0;
   double paintRequird = 0;
  Scanner sc = new Scanner(System.in);

System.out.println("Enter price of paint per gallon:");
paintCost = sc.nextDouble();

System.out.println("Enter no of rooms:" );
rooms = sc.nextInt();
for( int i = 1; i<= rooms; i++)
{ 
   System.out.println("Enter square feet of wall:" + i);
 wallSquareFeet = sc.nextInt();
totalSquareFeet = wallSquareFeet+ totalSquareFeet;
}

paintRequird(totalSquareFeet);
double paintNeed=paintRequird(totalSquareFeet);
double hoursNeeded  = hoursRequird(totalSquareFeet);
double paintPrice =costOfPaint (  paintNeed, paintCost);
 double labourPrice = laborCost(  hoursNeeded);
System.out.println(" total paint needed :" +paintRequird(totalSquareFeet));

System.out.println(" total hours needed :" +hoursRequird(totalSquareFeet));

System.out.println(" total cost of paint :" +costOfPaint(paintNeed,paintCost));

System.out.println(" total labour charges :" +laborCost(hoursNeeded));

System.out.println(" total cost of paint job :" +totalCost(paintPrice,labourPrice));
}


public static double paintRequird ( double totalSquareFeet)
{ 
  double paintNeed = totalSquareFeet/115;
return paintNeed;
}

public static double hoursRequird ( double totalSquareFeet)
{ 
   double hoursNeeded = totalSquareFeet*100/115;
return hoursNeeded;
}

public static double costOfPaint ( double paintNeed,double paintCost)
{ 
   Double paintPrice = paintNeed * paintCost;
return paintPrice;
}

public static double laborCost( double hoursNeeded)
{ 
   Double labourPrice = hoursNeeded* 18;
return labourPrice;
}

public static double totalCost( double paintPrice,double labourPrice)
{ 
   double totalPrice = paintPrice+labourPrice;
return totalPrice;
}
    
}

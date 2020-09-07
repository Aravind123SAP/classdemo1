
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
public class salestax {
    public static void main(String[] a)
    {
      Scanner Tax=new Scanner(System.in);
      double amountofpurchase;
      double statesalestax;
      double countysalestax;
      double totalsalestax;
      double totalofthesale;
      
      
      System.out.println("ITEMS THAT PURCHASING:-");
     amountofpurchase=Tax.nextInt();
     System.out.println("PURCHASED ITEM:- "+amountofpurchase);
     
     
     
     statesalestax=0.04*amountofpurchase;
     System.out.println("STATE SALES TAX:-"+statesalestax);
     
     countysalestax=0.02*amountofpurchase;;
     System.out.println("COUNTYSALESTAX:-"+countysalestax);
      
     totalsalestax=statesalestax+countysalestax;
     System.out.println("TOTALSALESTAX:-"+totalsalestax);
      
     
     totalofthesale=amountofpurchase+totalsalestax;
     System.out.println("TotalOFTHESALESTAX:-"+totalofthesale);
     
    }
    
}

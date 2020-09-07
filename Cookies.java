
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
public class Cookies 
    {
        public static void main(String[] args)
        {
             
            int cookies;
            
            int cookieatePerson;
            Scanner sc= new Scanner(System.in);
     
            System.out.println("40 Cookies of bag:-");
            System.out.println("PERSON EAT EACH COOKIE CAN CONSUME OF 30 CALORIE:-");
            System.out.println("MAN EATING NO OF COOKIES:-");
            cookieatePerson=sc.nextInt();
           
     
            cookies=cookieatePerson*30;

            System.out.println("PERSON EATING TOTAL NO OF COOKIES:- "+cookieatePerson);
            System.out.println("TOTAL NO OF CALORIES CONSUMED:-"+cookies);

        }
    }



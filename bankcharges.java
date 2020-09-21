
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
public class bankcharges {
       public static void main(String[] args) {
        
        double requiredCHECK;
        double minimumfees = 10;
        double checkFee = 0;
        double bankServiceFee;
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Number of checks required for a month");
        
        
        requiredCHECK =  scn.nextInt();
        
        if(requiredCHECK < 20){
            bankServiceFee = minimumfees+(requiredCHECK * 0.10);
        }else if(requiredCHECK < 40 ){
            bankServiceFee = minimumfees+(requiredCHECK * 0.08);
        }else if(requiredCHECK < 60){
            bankServiceFee = minimumfees+(requiredCHECK * 0.06);
        }else{
            bankServiceFee = minimumfees+(requiredCHECK * 0.04);
        }
        
        System.out.println("Comision chages applicable for bank services = "+bankServiceFee);
    }
}
    


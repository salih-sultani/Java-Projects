
package bmi;

import java.util.Scanner;


public class BMI {

 
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double w;
        
        System.out.println("Give me your weight?");
        w=input.nextDouble();
        
        if (w>=30){System.out.println("obese");}
        else if(w>25.0){System.out.println("over wegiht!");}
        else if(w>=18.5){System.out.println("Normal!");}
        else{System.out.println("under wegiht!");}
        
        
        
    }
    
}

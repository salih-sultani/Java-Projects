
package javaapplication7leap.year;

import java.util.Scanner;


public class JavaApplication7leapYear {

 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the year");
        int year;
        year = input.nextInt();
        
         boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
         
         if (isLeapYear){
        System.out.println("This year is a LeapYear ");
    }
         else {
             System.out.println("Unfortunately, This is not a LeapYear");
         }
    }
    
}

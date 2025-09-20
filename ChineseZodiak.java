
package chinesezodiak;

import java.util.Scanner;


public class ChineseZodiak {

 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Write a value for year");
        year = input.nextInt();
        
        if (year % 12 == 0){
            System.out.println("Lion Year");
        }
        else if (year % 12 == 1){
            System.out.println("Sheep Year");
        }
        else if (year % 12 == 2){
            System.out.println("Cat Year");
        }
        else if (year % 12 == 3){
            System.out.println("Deer Year");
        }
         else if (year % 12 == 4){
             System.out.println("Shark Year");
         }
         else if (year % 12 == 5){
             System.out.println("Fish Year");
         }
        else if (year % 12 == 6){
             System.out.println("Tiger Year");
        }
         else if (year % 12 == 7){
             System.out.println("Rabbit Year");
        }
         else if (year % 12 == 8){
             System.out.println("Dragon Year");
        }
         else if (year % 12 == 9){
             System.out.println("Snake Year");
        }
         else if (year % 12 == 10){
             System.out.println("Horse Year");
        }
         else if (year % 12 == 11){
             System.out.println("Mouse Year");
        }
         else {
             System.out.println("Nothing!");
         }
    }
    
}

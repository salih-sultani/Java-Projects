package advance.math.tool;

import java.util.Scanner;

public class AdvanceMathTool {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A = 1;
        int C = 0;
        while (A <= 5) {
            int num1 = 50 + (int) (Math.random() * 100);
            System.out.println("Random1 is: " + num1);
            int num2 = (int) (Math.random() * 100);
            System.out.println("Random2 is: " + num2);
            int sum = num1 - num2;
            System.out.println("What is the solution for " + num1 + " - " + num2);
            int answer = input.nextInt();
            if (answer == sum) {
                C++;
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect");
                A++;

            }

        }
        System.out.println("You solved " + C + "  From 5 Questions");

    }

}

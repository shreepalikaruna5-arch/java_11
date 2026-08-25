// Write a program to determine whether a number is even or odd.
import java.util.Scanner;

public class Ques2{

    public void checkEvenOdd() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } 
        else {
            System.out.println(num + " is odd.");
        }

        input.close();
    }
}
import java.util.Scanner;

public class Ques1 {
    public void findPN() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("The number " + num + " is positive");
        } else if (num < 0) {
            System.out.println("The number " + num + " is negative");
        } else {
            System.out.println("The number is zero");
        }

        input.close();
    }
}
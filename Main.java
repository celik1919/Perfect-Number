import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mec = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = mec.nextInt();
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println(number + " is the perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
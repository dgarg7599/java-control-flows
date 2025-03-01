import java.util.Scanner;

public class DivisibilityByFive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check divisibility using modulus operator
        boolean isDivisible = (number % 5 == 0);

        // Display the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    }
}


import java.util.Scanner;

class AgeEntryKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the age is 21 or over
        if (age >= 21) {
            System.out.println("You get a wristband.");
        }

        scanner.close();
    }
}

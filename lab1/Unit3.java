import java.util.Scanner;

class Clause3part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}

public class Unit3 {
    public static void main(String[] args) {
        System.out.println("Unit 3");
        Clause3part2.main(args);
        System.out.println();
    }
}

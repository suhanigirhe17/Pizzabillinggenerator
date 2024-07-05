import java.util.Scanner;

public class PizzaBillGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Pizza Bill Generator!");
        System.out.print("Enter the number of pizzas: ");
        int numPizzas = scanner.nextInt();

        double totalCost = 0;

        for (int i = 0; i < numPizzas; i++) {
            System.out.print("Enter the size of pizza " + (i + 1) + " (S/M/L): ");
            char size = scanner.next().charAt(0);

            double cost = 0;
            switch (size) {
                case 'S':
                    cost = 10.99;
                    break;
                case 'M':
                    cost = 14.99;
                    break;
                case 'L':
                    cost = 19.99;
                    break;
                default:
                    System.out.println("Invalid size. Please enter S, M, or L.");
                    continue;
            }

            System.out.print("Enter the number of toppings for pizza " + (i + 1) + ": ");
            int numToppings = scanner.nextInt();

            cost += numToppings * 1.50;

            totalCost += cost;

            System.out.println("Cost of pizza " + (i + 1) + ": $" + String.format("%.2f", cost));
        }

        System.out.println("Total cost: $" + String.format("%.2f", totalCost));
    }
}
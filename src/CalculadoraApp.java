import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("**** Calculator App ***\n");
            // Show menu
            System.out.println("""
                1. Sum
                2. Rest
                3. Multiplication 
                4. Division 
                5. Exit
                """);
            System.out.print("Type an option: ");
            try {
                var operation = Integer.parseInt(console.nextLine());
                // Check options range
                if (operation >= 1 && operation < 5) {
                    System.out.print("Type operator 1: ");
                    var operator1 = Integer.parseInt(console.nextLine());
                    System.out.print("Type operator 2: ");
                    var operator2 = Integer.parseInt(console.nextLine());

                    int result = 0;
                    switch (operation) {
                        case 1 ->
                                result = operator1 + operator2;
                        case 2 ->
                                result = operator1 - operator2;
                        case 3 ->
                                result = operator1 * operator2;
                        case 4 ->
                                result = operator1 / operator2;
                        default ->  System.out.println("Invalid operation");
                    }
                    System.out.println("Result: " + result);
                } else if (operation == 5) {
                    System.out.println("End...");
                    break;
                } else {
                    System.out.println("Invalid operation");
                }
            } catch (Exception e) {
                System.out.println("Error:" + e.getMessage());
            }
        } // end while
    } // end main
} // end class

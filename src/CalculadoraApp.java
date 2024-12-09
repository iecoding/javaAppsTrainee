import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        System.out.println("**** Calculator App ***\n");
        System.out.println("Type operator 1: ");
        Scanner console = new Scanner(System.in);
        var operator1 = Integer.parseInt(console.nextLine());
        System.out.println("Type operator 2: ");
        var operator2 = Integer.parseInt(console.nextLine());
        var result = operator1 + operator2;
        System.out.println("Result: " + result);
    }
}

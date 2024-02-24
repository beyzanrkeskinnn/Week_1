import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num1;
        double num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        num1 = input.nextInt();
        System.out.println("Enter a double: ");
        num2 = input.nextDouble();
        double num1_double = (double) num1;
        System.out.println("whole number to decimal number: " + num1_double);
        int num2_integer = (int) num2;
        System.out.println("from decimal to integer: " + num2_integer);

        }
    }

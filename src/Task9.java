import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println(num1 + " + " +  num2 + " is " + (num1 + num2));

        System.out.println(num1 + " * " + num2 + " is " + (num1 * num2));

        System.out.println(num1 + " - " + num2 + " is " + (num1 - num2));

        System.out.println(num1 + " / " + num2 + " is " + (num1 / num2));



    }
}

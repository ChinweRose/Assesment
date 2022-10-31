import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        for (int counter = 0; counter <=12; counter ++ )
            System.out.println(num + "*" + (counter + 1) + "=" + num * (counter + 1));

    }
}

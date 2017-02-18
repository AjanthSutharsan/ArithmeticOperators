
import java.util.Scanner;
public class Question4
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        double num1 = input.nextInt();
        System.out.println("Enter the exponent.");
        double num2 = input.nextInt();
        double num3 = Math.pow(num1, num2);
        System.out.println("The result is "+num3);
    }


}

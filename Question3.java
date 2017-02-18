
import java.util.Scanner;
public class Question3
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        int Number = input.nextInt();
        if (Number % 2 == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd.");
        }
    }


}

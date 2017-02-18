
import java.util.Scanner;
public class Question1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total amount of the bill.");
        int totalAmount = input.nextInt();
        System.out.println("How many people are there?");
        int totalPeople = input.nextInt();
        int individualAmount = totalAmount/totalPeople;
        System.out.println("Each person should pay £"+individualAmount);
    }


}

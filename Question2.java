
import java.util.Scanner;
public class Question2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many sweets are there in total?");
        int totalSweets = input.nextInt();
        System.out.println("How many people are there");
        int totalPeople = input.nextInt();
        int individualSweets = totalSweets / totalPeople;
        int leftover = totalSweets % totalPeople;
        System.out.println("There will be "+individualSweets+" sweets each and there would be "+leftover+" left over.");
    }


}

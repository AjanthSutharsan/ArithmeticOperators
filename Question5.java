
import java.util.Scanner;
public class Question5
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        String ISBN;
        do {
            System.out.println("Enter a 13 digit ISBN number without dashes or spaces.");
            ISBN = input.nextLine();
        } while(ISBN.length()!=13);
        
        for(int i=0; i<13; i+=2) {
            total += Character.getNumericValue(ISBN.charAt(i));
        }
        
        for(int i=1; i<13; i+=2) {
            total += Character.getNumericValue(ISBN.charAt(i))*3;
        }
        
        if (total % 10 ==0) {
            System.out.println("The ISBN number is valid.");
        }
        else {
            System.out.println("The ISBN number is not valid.");
        }
    }


}

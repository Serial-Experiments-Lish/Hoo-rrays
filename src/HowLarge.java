import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) throws Exception {
        ArrayList<String> shoeStrings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string:");

        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                int accountantElement = shoeStrings.size();
                System.out.println("The total amount of items in the list was: " + accountantElement);
                break;
            }
            shoeStrings.add(input);
        }
    }
}
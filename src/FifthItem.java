import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) throws Exception {
        ArrayList<String> randomStrings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string:");

        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                String fifthElement = randomStrings.get(4);
                System.out.println("The fifth item in your list was " + fifthElement);
                break;
            }
            randomStrings.add(input);
        }
    }
}

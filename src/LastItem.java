import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) throws Exception {
        ArrayList<String> sillyStrings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string:");

        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                String lastElement = sillyStrings.get(sillyStrings.size() - 1);
                System.out.println("The last item in the list is: " + lastElement);
                break;
            }
            sillyStrings.add(input);
        }
    }
}
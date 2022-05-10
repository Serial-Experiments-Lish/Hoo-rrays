import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> fullInt = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any integer:");
        
        while (true) {
            int input = scanner.nextInt();

            if (input == 0) {
                System.out.println("Done entering integers into the list.");
                System.out.println("What number are you looking for in the list?");
                int index = scanner.nextInt();
                for (int i = 0; i < fullInt.size(); i++) {
                    if (index == fullInt.get(i)) {
                        System.out.println(index + " is at index " + i);
                    }
                }
            }
            fullInt.add(input);
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> summInt = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some integers.  When you are done, enter 0.");
        
        while (true) {
            int input = scanner.nextInt();

            if (input == 0) {
                System.out.println("Done entering integers into the list.");
                break;
            }
            summInt.add(input);
        }

        int sum = 0;
        for (int i = 0; i < summInt.size(); i++) {
            sum += summInt.get(i);
        }
        System.out.println("The sum of your list is: " + sum);
    }

    // public static void numbers() {
    //     for(int i = 0; i < summInt.size(); i++) {
    //         System.out.print(summInt.get(i) + " were the items in the list.")
    //   Tried to make a method for printing the numbers involved in the list.  }
    // }
}
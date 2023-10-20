import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pangram {

    public static boolean isPangram(String input) {
        // Convert the input to lowercase to ignore case
        input = input.toLowerCase();

        // Set to store unique alphabets
        Set<Character> alphabetSet = new HashSet<>();

        // Iterate through each character in the input and add it to the set if it's an alphabet
        for (char ch : input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                alphabetSet.add(ch);
            }
        }

        // Check if the set size is 26 (number of alphabets from A to Z)
        return alphabetSet.size() == 26;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

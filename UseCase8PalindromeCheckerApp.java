import java.util.*;

public class UseCase8PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {
        LinkedList<Character> list = new LinkedList<>();

        for (char c : input.toCharArray()) list.add(c);

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input);

        System.out.println("Is Palindrome? : " + result);
        sc.close();
    }
}
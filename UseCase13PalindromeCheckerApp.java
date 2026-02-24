import java.util.*;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        PalindromeStrategy strategy = new StackStrategy();

        long start = System.nanoTime();
        boolean result = strategy.check(input);
        long end = System.nanoTime();

        long time = end - start;

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + time + " ns");
        sc.close();
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}
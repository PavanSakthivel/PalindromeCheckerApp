import java.util.Scanner;

class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        boolean pal = isPalindrome(input);
        if (pal){
            System.out.println("Is it a palindrome? :" + " true");
        } else {
            System.out.println("Is it a palindrome? :" + " false");
        }
        sc.close();
        
        
    }
    
    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }
}
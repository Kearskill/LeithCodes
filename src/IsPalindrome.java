import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check palindrome: ");
        String word = sc.next();
        if (isPalindrome(word)){
            System.out.println("The word " + word + " is a palindrome.");
        } else{
            System.out.println("The word " + word + " is not a palindrome.");
        }
    }
    private static boolean isPalindrome(String x){
        int left = 0;
        int right = x.length() - 1; // the right side

        while(left<right){
            if(x.charAt(left) != x.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

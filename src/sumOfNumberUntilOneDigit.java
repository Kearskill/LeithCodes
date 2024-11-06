import java.util.Scanner;

public class sumOfNumberUntilOneDigit {
    public static void main(String[] args) {
        //not that useful
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0 || sum >9){
            if (n==0){
                n = sum;
                sum = 0;
            }

            sum+= n%10;
            n /= 10;
        }
        System.out.println("Sum of digits until single digit: " + sum);
    }
}

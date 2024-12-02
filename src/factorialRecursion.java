public class factorialRecursion {
    public static void main(String[] args) { // driver
        int num = 10;
        System.out.println("Factorial of number " + num + " is " + factorial(num) +".");
    }
    private static int factorial(int n){
        if (n==0 || n==1){
            return n;
        }
        return n * factorial(n-1);
    }
}

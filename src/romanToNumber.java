import java.util.Scanner;

public class romanToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanNumerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("The roman numerals of " + num);

        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (num > 0){
            if(num>=values[i]){
                ans.append(romanNumerals[i]);
                num = num - values[i];
            } else {
                i++;
            }
        }
        System.out.println(" is " + ans + ".");
    }
}

package Java.Number_practice;

public class palindrome {
    public static void main(String[] args) {
        int n = 3921293;
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;

            sum = sum * 10 + digit;

            temp /= 10;

        }
        
        if(n==sum)
            System.out.println("Palindrome number");

        else
            System.out.println("not a palindrome number");
    }
}

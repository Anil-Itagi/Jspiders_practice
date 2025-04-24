package Java.practice;

public class Sum_digits {
    public static void main(String[] args) {
        
        //condition number of digits in a given number should be even
        int n = 2120;
        int temp = n;

        int sum = 0;

        while (temp > 0) {

            int digit1 = temp % 10;
            temp = temp / 10;

            int digit2 = temp % 10;
            temp = temp / 10;

            digit2 = digit2 * 10 + digit1;

            sum = sum + digit2;

        }
        
        System.out.println(sum);
    }
    
}

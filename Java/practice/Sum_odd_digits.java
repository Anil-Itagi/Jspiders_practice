package Java.practice;

public class Sum_odd_digits {

    public static void main(String[] args) {
        int n = 123234;
        
        int sum = 0;

        int temp = n;

        while (temp > 0) {
            int digit1 = temp % 10;
            temp = temp / 10;

            int digit2 = temp % 10;
            temp = temp / 10;

            int digit3 = temp % 10;
            temp = temp / 10;

            sum += (digit3 * 100) + (digit2 * 10) + digit1;

        }
        
        System.out.println(sum);
    }
    
}

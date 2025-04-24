package Java.practice;

public class Sum_of_digits {
    public static void main(String[] args) {
        int n = 939412;
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit1 = temp % 10;
            temp = temp / 10;

            int digit2 = temp % 10;
            temp = temp / 10;

            if (digit1 % 2 == 0) {
                sum = sum + (digit2 * 10) + digit1;
            }
        }

        System.out.println(sum);
    }
    
}

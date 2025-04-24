package Java.practice;

public class Fact_odd_cube_even {


    public static int fact(int digit) {
        if (digit == 0)
            return 1;
        return digit * fact(digit - 1);
    }

    public static void main(String[] args) {
        
        int n = 2210;
        double sum = 0;
    
        int temp = n;
    
        while (temp > 0) {
            int digit = temp % 10;
            temp = temp / 10;
            if (digit % 2 == 0) {
                sum = sum + Math.pow(digit, 3);
            } else {
                sum = sum + fact(digit);
            }
            System.out.println(sum);
        }
        System.out.println(sum);
    }

    
}

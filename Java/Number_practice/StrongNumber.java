package Java.Number_practice;

public class StrongNumber {
    public static void main(String[] args) {
        //strong number

        int n = 145;
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + fact(digit);
            temp /= 10;
        }

        if(sum==n)
            System.out.println("Given number is Strong number");
        else
        System.out.println("given number is not a Strong number");
    }

    public static int fact(int digit) {
        if(digit==0)
            return 1;
        return digit * fact(digit - 1);
    }
}

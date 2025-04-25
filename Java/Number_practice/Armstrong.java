package Java.Number_practice;

public class Armstrong {
    public static void main(String[] args) {
        int n = 9474;
        int temp=n;
        int length = 0;

        double sum=0;
        
        // find the number of digits of the number
        while (temp > 0) {
            temp /= 10;
            length++;
        }

        
        // check armstrong number or not
        temp=n;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + Math.pow(digit, length);
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println("YES armstrong number");
        }
        else {
            System.out.println("NOT armstrong number");
        }
    }
}

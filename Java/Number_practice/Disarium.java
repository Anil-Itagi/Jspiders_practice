package Java.Number_practice;

public class Disarium {
    public static void main(String[] args) {
        int n = 137;
        int temp=n;
        int count=0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            temp /= 10;
            sum += Math.pow(digit, count--);
            
        }
        if(sum==n)
            System.out.println("The gieven number is Disarium number");
        else
            System.out.println("The gieven number is not Disarium number");

    }
}

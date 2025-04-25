package Java.Number_practice;

public class spy {
    public static void main(String[] args) {
        int n = 1124;
        int temp = n;
        int sum = 0;
        int mul = 1;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            mul *= digit;
            temp = temp / 10;
        }

        if (sum == mul) {
            System.out.println("Spy number");
        }
        else {
            System.out.println("Not a spy number");
        }
    }
}

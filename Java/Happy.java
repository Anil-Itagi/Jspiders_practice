package Java;

public class Happy {
    public static void main(String[] args) {

        int n = 45;
        while (n >= 9) {
            int c = check(n);
            System.out.println(c);
            n = c;
        }
        
        if (n == 1) {
            System.out.println("given number is Happy number");
        }
        else {
            System.out.println("Given number is not Happy number");
        }
    }
    
    public static int check(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit);
            n = n / 10;
        }
        return sum;
    }
}

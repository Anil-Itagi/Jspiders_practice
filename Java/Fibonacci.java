package Java;

public class Fibonacci {
    public static void main(String[] args) {

        int n=10;

        int a = 0;
        int b = 1;
        if (n == 1) {
            System.out.println(0);
        }
        
        System.out.println(0);
        System.out.println(1);
        
        
        for (int i = 2; i <= n; i++) {
            int temp = a;
            a = b;
            b = temp +b;
            System.out.println(b);
        }
    }
}

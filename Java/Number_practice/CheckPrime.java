package Java.Number_practice;

public class CheckPrime {
    public static void main(String[] args) {
        int n = 31;
        boolean temp = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                temp = true;
                break;
            }
        }
        if (temp) {
            System.out.println("Given number is not prime number");
        }
        else {
            System.out.println("Given number is a prime number");
        }
    }
    
}

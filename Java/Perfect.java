package Java;

public class Perfect {

    public static void main(String[] args) {
        int sum=1;
        int n=28;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if(sum==n)
            System.out.println("given number is perfect number");
        else 
           System.out.println("given number is not a perfect number");
    }
    
}

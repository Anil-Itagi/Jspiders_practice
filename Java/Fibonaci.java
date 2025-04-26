package Java;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = s.nextInt();
        if (n == 1)
            System.out.println(0);
      
        System.out.println(0);
        System.out.println(1);
        fibo(n,true);
    }

    public static int fibo(int n,boolean temp) {
        
        if (n == 1) {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        int b = fibo(n - 2,false) + fibo(n - 1,temp);
        if(temp)
           System.out.println(b);
        return b; 
    }
}

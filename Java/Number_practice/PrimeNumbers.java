package Java.Number_practice;

public class PrimeNumbers {

    public static void main(String[] args) {
        int start = 2;
        int end = 40;

        for (int i = start; i <= end; i++) {

            boolean temp=false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp = true;
                    break;
                }
            }
             
            if (!temp) {
                System.out.println(i);
            }
        }
    }
    
}

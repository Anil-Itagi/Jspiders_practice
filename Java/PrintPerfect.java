package Java;

public class PrintPerfect {
    public static void main(String[] args) {
        int n = 10000;
        for (int i = 1; i < n; i++) {

            int sum = 1;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            sum = sum - 1;

            if (sum == i)
                System.out.println(i);
        }
        
    }
}

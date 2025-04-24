package Java.practice;

public class Squere_even_Cube_odd {
    public static void main(String[] args) {
        int n = 3030;
        double sum = 0;

        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            temp = temp / 10;
            if (digit % 2 == 0) {
                sum = sum + Math.pow(digit, 2);
            } else {
                sum = sum + Math.pow( digit,3);
            }
        }
        
        System.out.println(sum);

    }
}

package Java.practice;

public class Squere {

    public static void main(String[] args) {

        int n = 3;
        int temp = n;
        double sum = 0;
        while (temp > 0) {
            int digit   = temp%10;
            temp=temp/10;
            if(digit%2==0){
                sum=sum+Math.pow(digit,3);
            }
            else{
                sum=sum+Math.pow(2,digit);
            }
        }

        System.out.println(sum);
    }

    
}

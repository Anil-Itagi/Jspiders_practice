package Java.Number_practice;

public class Automorphic {
    public static void main(String[] args) {
        int n = 76;
        int temp = n;
        int count=1;
        int squre = n * n;


        while(temp>0)
        {
            count = count * 10;
            temp /= 10;
        }
        
        // System.out.println(count);
        
        if(squre%count==n)
            System.out.println("Automorphic");
        else
           System.out.println(" not Automorphic");
        

        
    }
}

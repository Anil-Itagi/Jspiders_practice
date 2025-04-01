public class MainClass {
    public static void main(String[] args) {

        System.out.println("Main starts");
        Add.add(10, 10);
        Sub.sub(20, 10);
        double res = Mul.mul(10, 20);
        System.out.println("Multiplication result is " + res);
        
        System.out.println("Main ends here");

    }
}

class Add {
    public static void add(int a, double b) {
        double sum = a + b;
        System.out.println("Sum is " + sum);
    }
}

class Sub {
    public static void sub(int a, int b) {
        int res = a - b;
        System.out.println("Sub is " + res);
    }
}

class Mul {
    public static double mul(int a, double b) {
        double res = a * b;
        return res;
    }
}

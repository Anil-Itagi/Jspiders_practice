package Java.nonStatic;

public class Squere {

    int b = 20;

    public void area() {
        int x = 7;
        int res = x * x;
        System.out.println("The result is " + res);
    }

    public static void main(String[] args) {

        System.out.println("Main starts...");

        Squere s = new Squere();
        System.out.println(s.b);
        s.area();

    }

}

class newClass {
    public static void hi() {
        System.out.println("I am form hii");
    }
}

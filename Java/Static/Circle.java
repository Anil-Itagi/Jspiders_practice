public class Circle {
    public static void main(String[] args) {
     Area.area();
    }
}

class Area {
    
    public static void area() {
        int r = 10;
        final double pi = 3.142;
        double res = pi * r * r;

        System.out.println("Area of circle is "+res);
    }
}

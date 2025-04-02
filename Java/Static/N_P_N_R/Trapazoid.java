package N_P_N_R;

public class Trapazoid {
    public static void main(String[] args) {
        System.out.println("Main starts");
        AreaTrapazoid.area();
    }
}

class AreaTrapazoid {
    public static void area() {
        int a = 10;
        int b = 5;
        int h = 20;
        double res = 0.5 * (a + b) * h;
        System.out.println("The area is "+res);
    }
}

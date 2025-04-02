package N_P_N_R;
public class Traingle {
    public static void main(String[] args) {
        System.out.println("Main stats here");
        Area.area();
    }
}

class Area {
    public static void area() {
        int l = 20;
        int b = 15;
        double result = 0.5 * l * b;
        System.out.println(" Area of the triangle "+result);
    }
}

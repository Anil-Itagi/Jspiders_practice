package W_P_N_R;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Main starts");
        TriangleArea.area(9,5 );
    }
}

class TriangleArea {
    public static  void area(int b, int h) {
        double res = 0.5 * b * h;
        System.out.println("The ares is "+res);
    }
}

package W_P_N_R;

public class Rectangle {
    public static void main(String args[]) {
        System.out.println("Main stats");
        RectangleArea.area(6, 12);
    }
}

class RectangleArea {
    public static void area(int l, int b) {
        int res = l * b;
        System.out.println("The ares is "+res);
    }
}
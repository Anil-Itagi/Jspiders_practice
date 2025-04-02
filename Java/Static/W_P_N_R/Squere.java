package W_P_N_R;

public class Squere {
    public static void main(String[] args) {
        System.out.println("Main starts");
        SquereArea.area(37);
    }
}

class SquereArea {
    public static void area(int a) {
        int res = a * a;
        System.out.println("The area is "+res);
    }
}

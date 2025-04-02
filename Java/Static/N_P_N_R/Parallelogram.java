package N_P_N_R;

public class Parallelogram {
    public static void main(String[] args) {
        System.out.println("Main starts");
        AreaParallelogram.parallelogram_area();
    }
}

class AreaParallelogram {
    
    public static void parallelogram_area() {
        int base = 20;
        int height = 10;
        int res = base * height;
        System.out.println("The area is "+res);
    
    }
}

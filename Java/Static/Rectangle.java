class Area {
    static void area() {
        int l = 10;
        int b = 20;
        int result = l * b;
        System.out.println("Area of Rectangle is : "+result );
    }
}

public class Rectangle{
    public static void main(String[] args){
        System.out.println(" Main start ");
        Area.area();  
    }
}
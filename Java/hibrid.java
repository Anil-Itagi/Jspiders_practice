package Java;


class Demo {
    int x = 10;

}

class Sample extends Demo {
    int y = 30;


}

class Tester extends Demo {
    int i = 20;

}

class Sample1  extends Tester{
    int z = 300;
    
}

public class hibrid {
    public static void main(String[] args) {

        Sample1 s1 = new Sample1();
        System.out.println(s1.x);
        System.out.println(s1.i);
        System.out.println(s1.z);

        Sample s2 = new Sample();
        System.out.println(s2.x);
        System.out.println(s2.y);
        
    }
    
}

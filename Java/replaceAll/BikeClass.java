class Bike {
    void sound() {
        System.out.println("all bikes make sound");
    }
}

class Java extends Bike {
    void sound() {
        System.out.println("bur bur java");
    }
}

class Pulser extends Bike {
    void sound() {
        System.out.println("Pulser dur dur dur");
    }
}

class BMW extends Bike {
    void sound() {
        System.out.println("DMW make sound uy uy uy");
    }
}

class Simulator {
    public static void veh_sound(Bike bike) {
        bike.sound();
    }
}


public class BikeClass {

    BikeClass() {
        say();
    }

    public static void say() {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        // Java j1 = new Java();
        // Pulser p1 = new Pulser();
        // BMW b1 = new BMW();

        // Simulator.veh_sound(b1);
        // Simulator.veh_sound(p1);
        // Simulator.veh_sound(j1);
    }
}

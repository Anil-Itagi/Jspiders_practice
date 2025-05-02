class RedBus {
    void ticket() {
        System.out.println("book Ticket online");
    }
}

class VRL extends RedBus {
    void ticket() {
        System.out.println("book VRL Tickets");
    }
}

class Janata extends RedBus {
    void ticket() {
        System.out.println("book Janata tickets");
    }
}

class Airavata extends RedBus {
    void ticket() {
        System.out.println("book Airavata tickets");
    }
}

class Booking {
    public static void tickets(RedBus a) {
        a.ticket();
    }
}



public class MainClass {
    public static void main(String[] args) {

        VRL v1 = new VRL();
        Janata j1 = new Janata();
        Airavata a1 = new Airavata();
        Booking.tickets(a1);
        Booking.tickets(j1);
        Booking.tickets(v1);
        
    }
}

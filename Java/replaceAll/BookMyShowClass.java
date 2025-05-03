class BookMyShow {
    void movie() {
        System.out.println("book ticket for your movie");
    }
}

class Sandlewood extends BookMyShow {
    void movie() {
        System.out.println("book sandlewood ticket for your movie");
    }
}

class Bollywood extends BookMyShow {
    void movie() {
        System.out.println("Book a any Bollywood movie ticket");
    }
}

class Hollywood extends BookMyShow {
    void movie() {
        System.out.println("Book a any Hollywood movie ticket");
    }
}


class Booking1 {
    public static void movies(BookMyShow s) {
        s.movie();
    }
}

public class BookMyShowClass {
    public static void main(String[] args) {
        Sandlewood s1   = new Sandlewood();
        Bollywood b1 = new Bollywood();
        Hollywood h1 = new Hollywood();

        Booking1.movies(s1);
        Booking1.movies(b1);
        Booking1.movies(h1);

    }
}

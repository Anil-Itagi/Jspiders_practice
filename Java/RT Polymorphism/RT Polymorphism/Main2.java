class Bookmyshow
{
	void movie()
	{
		System.out.println("Book now have a good weekend");
	}
}
class Bollywood extends Bookmyshow
{
	void movie()
	{
		System.out.println("Bollywood drama never ends");
	}
}
class Sandalwood extends Bookmyshow
{
	void movie()
	{
		System.out.println("The never ending hits");
	}
}
class Hollywood extends Bookmyshow
{
	void movie()
	{
		System.out.println("Filled with actions");
	}
}
class Booking
{
	static void movies(Bookmyshow t1)
	{
		t1.movie();
	}
}
class Main2
{
	public static void main(String[]args)
	{
		Sandalwood s=new Sandalwood();
		Hollywood h=new Hollywood();
		Bollywood b=new Bollywood();
		Booking.movies(s);
		Booking.movies(h);
		Booking.movies(b);

	}
}
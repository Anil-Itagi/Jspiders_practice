class redbus
{
	void ticket()
	{
		System.out.println("Book now have a good weekend");
	}
}
class VRL extends redbus
{
	void ticket()
	{
		System.out.println("badddd...baddd...bbaaaddd");
	}
}
class Janata extends redbus
{
	void ticket()
	{
		System.out.println("zooommmmm.....zoooommmm....");
	}
}
class Airavata extends redbus
{
	void ticket()
	{
		System.out.println("vroommmm....vrooommmmmm");
	}
}
class Booking
{
	static void tickets(redbus t1)
	{
		t1.ticket();
	}
}
class Main4
{
	public static void main(String[]args)
	{
		VRL j=new VRL();
		Janata p=new Janata();
		Airavata b=new Airavata();
		Booking.tickets(j);
		Booking.tickets(p);
		Booking.tickets(b);

	}
}
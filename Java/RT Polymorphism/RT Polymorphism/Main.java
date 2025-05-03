class ola
{
	void ride()
	{
		System.out.println("Book Your Ride Now");
	}
}
class Auto extends ola
{
	void ride()
	{
		System.out.println("Book auto now and get 20% offer");
	}
}
class Bike extends ola
{
	void ride()
	{
		System.out.println("Book bike now at your doorstep");
	}
}
class Car extends ola
{
	void ride()
	{
		System.out.println("Book car and get additional discount");
	}
}
class Stimulator
{
	static void veh_ride(ola o1)
	{
		o1.ride();
	}
}
class Main
{
	public static void main(String[]args)
	{
		Auto a=new Auto();
		Bike b=new Bike();
		Car c=new Car();
		Stimulator.veh_ride(a);
		Stimulator.veh_ride(b);
		Stimulator.veh_ride(c);

	}
}
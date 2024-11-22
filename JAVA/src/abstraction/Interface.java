package abstraction;

interface vehicle {
	
	abstract void start();
	
	 default void stop() {
		 
		 System.out.println("the vehicle is stopped");
	
	}
}

class bike implements vehicle
{
	public void start()
	{
		System.out.println("The Bike Is Started");
	}
}

class car implements vehicle
{
	public void start()
	{
		System.out.println("The Car Is Started");
	}
}

class bus implements vehicle
{
	public void start()
	{
		System.out.println("The Bus Is Started");
	}
}

class truck implements vehicle
{
	public void start()
	{
		System.out.println("The Truck Is Started");
	}
}


public class Interface {
		
	public static void main(String[] args) {
		
		vehicle Mybus = new bus();
		vehicle Mycar = new car();
		vehicle Mybike = new bike();
		vehicle Mytruck = new truck();

		
		
		Mybus.start();
		Mybus.stop();
		
		Mycar.start();
		Mycar.stop();
		
		Mybike.start();
		Mybike.stop();
		
		Mytruck.start();
		Mytruck.stop();
		

	}

}

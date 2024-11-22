package abstraction;


abstract class whatsapp{
	
	abstract void button();
	
	{
		
	}
	
	void buttons()
	
	{
		System.out.println("sent");
	}
	
}

class example extends whatsapp{
	
	void button() 
	
	{
		
		System.out.println("send message");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		
		example e = new example();
		
		e.button();
		e.buttons();

	}
}

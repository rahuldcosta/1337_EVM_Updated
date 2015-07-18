package eVM_Demo2015;

public class BusyLamp {

	Boolean Lamp;
	
	public BusyLamp() {
		// TODO Auto-generated constructor stub
		Lamp=false;
		//System.out.println("Busy Lamp Glowing .....");
//		System.out.println("Currently System is Busy");
	}
	
	
	public Boolean getLamp() {
		return Lamp;
	}
	
	
	
	
	public void switchlamp()
	{
		if(Lamp)
		{	Lamp=false;
			System.out.println("Beep...............");
			System.out.println("Busy Lamp Off .....");
		
		}
		else{
			Lamp=true;
			System.out.println("Busy Lamp Glowing .....");
		}
	}
	
	
	
	
	
	

}

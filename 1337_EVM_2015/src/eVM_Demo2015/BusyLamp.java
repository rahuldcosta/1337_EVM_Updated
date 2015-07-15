package eVM_Demo2015;

public class BusyLamp {

	Boolean Lamp;
	
	public BusyLamp() {
		// TODO Auto-generated constructor stub
		Lamp=true;
//		System.out.println("Currently System is Busy");
	}
	
	
	public Boolean getLamp() {
		return Lamp;
	}
	public void setLamp(Boolean lamp) {
		Lamp = lamp;
	}
	
	public void switchlamp()
	{
		if(Lamp)
		{	Lamp=false;
			System.out.println("Beep...............");
		
		}
		else
			Lamp=true;
		
	}
	
	
	
	
	
	

}

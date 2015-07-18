package eVM_Demo2015;

public class ReadyLampBU {
	
	Boolean readystat;

	public ReadyLampBU() {
//		System.out.println("Ready Lamp Glowing .....");
		readystat=false;
	}
	
	public void switchonReadyLamp()
	{
		System.out.println("Ready Lamp Glowing .....");
		readystat=true;
	}
	
	public void switchoffReadyLamp()
	{
		System.out.println("Ready Lamp Off .....");
		readystat=false;
	}
	
	

}

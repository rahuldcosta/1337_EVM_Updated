package eVM_Demo2015;

public class OnLamp {

	Boolean onstat;
	public Boolean getOnstat() {
		return onstat;
	}
	
	public OnLamp() {
		// TODO Auto-generated constructor stub
		System.out.println("On Lamp Glowing .....");
		onstat=true;
	}
	
	public void switchonlamp()
	{

		if(onstat)
		{	onstat=false;
			System.out.println("Beep...............");
			System.out.println("On Lamp Off .....");
		}
		else
		{
			onstat=true;
			System.out.println("On Lamp Glowing .....");
		}}
	
	

}

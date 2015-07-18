package eVM_Demo2015;

public class ClosePoll {

	
	Boolean pollstat;
	public ClosePoll() {
		// TODO Auto-generated constructor stub
		pollstat=false;
		
	}
	
	public void startPoll()
	{
		if(!pollstat)
		{
		pollstat=true;
		System.out.println("Poll Are Opened,Voting Can Begin");
		}
		else
			System.out.println("Poll Already Open");
	}
	
	public void PressClosePollButton()
	{
		if(pollstat)
		{
		pollstat=false;
		System.out.println("Poll Closed No More Votes will be Accepted");
		}
		else
			System.out.println("Poll Already Closed");
	}
	
	
	
	

}

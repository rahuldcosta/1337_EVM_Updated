package eVM_Demo2015;

public class ClosePoll {

	
	Boolean pollstat;
	public ClosePoll() {
		// TODO Auto-generated constructor stub
		pollstat=true;
	}
	
	
	public void PressClosePollButton()
	{
		if(pollstat)
		{
		pollstat=false;
		System.out.println("Poll Closed No More Votes will be Accepted");
		}
		else
			System.out.println("Already Closed");
	}
	
	
	public void repopenPoll()
	{
		if(!pollstat)
		{
		pollstat=true;
		System.out.println("Poll Restarted");
		}
		System.out.println("Already Started");
	}
	

}

package eVM_Demo2015;

public class BallotSection {

	
	TotalButton tb;
	BallotButton bb;
	public BallotSection() {
		// TODO Auto-generated constructor stub
		
		tb= new TotalButton();
		bb= new BallotButton();
	}
	
	
	public void pressTotalButton(Counter c)
	{
		tb.pressTotalButton(c);
	}
	
	public Boolean pressBallotButton()
	{
		if(!bb.getVoteallowed())
		{
		bb.pressBallotButton();
		return true;
		}
		else
		{
			System.out.println("BallotButton is Already Pressed,Not More Than one Vote Allowed at a Time");
			return false;
		}
	}
	
	public void ReleaseBallotButton()
	{
		if(bb.getVoteallowed())
		
		bb.releaseBallotButton();
		else
			System.out.println("Already Released BallotButton");
	}

}

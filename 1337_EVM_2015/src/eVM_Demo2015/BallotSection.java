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
	
	public Boolean pressBallotButton(ControlUnitofEVM cu)
	{
		if(!bb.getVoteallowed())
		{
			System.out.println("BallotButton is Pressed");
		bb.pressBallotButton();
		cu.ds.Bl.switchlamp();
		return true;
		}
		else
		{
			System.out.println("BallotButton is Already Pressed,Not More Than one Vote Allowed at a Time");
			return false;
		}
	}
	
	public void ReleaseBallotButton(ControlUnitofEVM cu)
	{
		if(bb.getVoteallowed())
		{
		bb.releaseBallotButton();
		cu.ds.Bl.switchlamp();}
		else
			System.out.println("Already Released BallotButton");
	}

}

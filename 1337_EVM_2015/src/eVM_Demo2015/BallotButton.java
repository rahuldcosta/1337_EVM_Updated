package eVM_Demo2015;

public class BallotButton {

	Boolean voteallowed;
	public Boolean getVoteallowed() {
		return voteallowed;
	}


	public BallotButton() {
		// TODO Auto-generated constructor stub
		voteallowed=false;
	}
	
	
	public Boolean pressBallotButton()
	{
		//make busylamp glow
		voteallowed=true;
		System.out.println("One Vote Allowed in Ballot Unit");
		
		return voteallowed;
	}
	
	public Boolean releaseBallotButton()
	{
		voteallowed=false;
		System.out.println("BallotButton Released ,Vote Casted");
		
	return	voteallowed;
	}

}

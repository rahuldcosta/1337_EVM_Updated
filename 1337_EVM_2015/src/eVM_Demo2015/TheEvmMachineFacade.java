package eVM_Demo2015;

import java.util.ArrayList;

public class TheEvmMachineFacade {

	private BallotUnitofEVM bu;
	private ControlUnitofEVM cu;
	public TheEvmMachineFacade(int noofcandidates) {
		// TODO Auto-generated constructor stub
		bu= new BallotUnitofEVM(noofcandidates);
		cu =new ControlUnitofEVM(noofcandidates);
	}
	
	public void submitcandidates(ArrayList<Candidateinfo> candis)
	{
		bu.submitcandidatelistforElection(candis);
		cu.result.OpenPollButton();
	}
	
	
	
	
	private void CasteVote(int voterchoice)
	{
		//bu.butos[voterchoice-1].HitCandidateButton(bu.candidates.get(voterchoice-1));
		
		cu.ds.cc.addvote(bu.candidates.get(voterchoice-1));
		
		
	}
	
	public void RequestVoteSequence(int voterch)
	{
		cu.bs.pressBallotButton(this.cu);
		bu.showlistofcandidates();
		//System.out.println(bu.butos);
		do{
		if( bu.butos[voterch-1].maskedstatus)
		{
			bu.butos[voterch-1].HitCandidateButton(bu.candidates.get(voterch-1));
			CasteVote(voterch);
			bu.clamp.makeLampOn(bu.candidates.get(voterch-1));
			cu.bs.ReleaseBallotButton(this.cu);
			bu.clamp.makeLampOff();
		}
		else
		{
			System.out.println("Button Unset,Please Select Another Candidate");
		}
		}while(bu.butos[voterch-1]==null &&!bu.butos[voterch-1].maskedstatus);
		
	}
	
	public void closetheElectionPoll()
	{
		cu.result.ClosePollsButton();
	}
	
	public void FinalResultsofElection()
	{
		cu.result.res1.ShowResultsofPoll1(bu.candidates);
	}
	
	public void ResetallCounterofEVM()
	{
		cu.result.pressClearButton(cu.ds.cc, bu.candidates);;
	}
	
	

}

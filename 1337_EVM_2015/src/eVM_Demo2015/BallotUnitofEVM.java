package eVM_Demo2015;

import java.util.ArrayList;

public class BallotUnitofEVM {

	SlideSwitchWindow sw;
	ReadyLampBU rlamp;
	CandidateButton[] butos;
	CandidateLampIndicator clamp;
	ArrayList<Candidateinfo> candidates;
	public BallotUnitofEVM(int noofcandidates) {
		// TODO Auto-generated constructor stub
		
		sw= new SlideSwitchWindow(noofcandidates);
		rlamp =new ReadyLampBU();
		clamp = new CandidateLampIndicator();
		//sw.getSwitchvalue()
		butos= new CandidateButton [(sw.getSwitchvalue()*16)];
		
		candidates = new ArrayList<Candidateinfo>();
		
	}
	
	public void initializeCandidateButtons()
	{
		int length=candidates.size();
		
		for(int i=0;i<length;i++)
		{
			this.butos[i]=new CandidateButton();
			this.butos[i].setMaskOff();
		}
	}
	
	public void submitcandidatelistforElection(ArrayList<Candidateinfo> candis)
	{
		candidates.addAll(candis);
		//initializeCandidateButtons();
		initializeCandidateButtons();
	}
	
	public void showlistofcandidates()
	{
		Candidateinfo temp;
		System.out.println("List of Candidates for Election");
		System.out.println("...............................");
		for(int i=0;i<candidates.size();i++)
		{
			temp=candidates.get(i);
			
			System.out.printf("No. "+(i+1)+"=>");
			temp.showdetailsofcandidate();
			System.out.println("");
		}
	}
	
	
	
	

}

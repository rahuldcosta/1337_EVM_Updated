package eVM_Demo2015;

public class CandidateButton {
	
	Boolean maskedstatus;

	public CandidateButton() {
		maskedstatus=false;
	}
	
	public void setMaskOff()
	{
		maskedstatus=true;
	}
	
	public void setMaskOn()
	{
		maskedstatus=false;
	}
	
	
	public void  HitCandidateButton(Candidateinfo ci)
	{
		System.out.printf("Voter Selects :-[[ ");
		ci.showdetailsofcandidate();
		System.out.printf("]]");
		System.out.println("");
	}
	

}

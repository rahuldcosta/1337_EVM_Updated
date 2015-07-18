package eVM_Demo2015;

public class CandidateSetSection {

	CandidateSetButton csb;
	public CandidateSetSection() {
		// TODO Auto-generated constructor stub
		csb= new CandidateSetButton();
	}
	
	public void setnoofcandidates(int cno)
	{
		csb.setTotalcandidates(cno);
	}

}

package eVM_Demo2015;

public class Candidateinfo {

	String name;
	String symbol;
	int myvotes;
	//CandidateButton cb;
	public Candidateinfo(String name, String symbol) {
		
		this.name = name;
		this.symbol = symbol;
		myvotes=0;
	//	cb.setMaskOff();
	}
	
	
	public void showdetailsofcandidate()
	{
		System.out.printf("Name:- "+ name+" Symbol:- "+symbol);
	}
	
	
	public void resetmycount()
	{
		this.myvotes=0;
	}


	
}

package eVM_Demo2015;

public class ControlUnitofEVM {

	DisplaySection ds;
	CandidateSetSection css;
	ResultSection result;
	BallotSection bs;
	public ControlUnitofEVM(int cnos) {
		// TODO Auto-generated constructor stub
		System.out.println("Evm Powered On");
		ds= new DisplaySection();
		css = new CandidateSetSection();
		css.setnoofcandidates(cnos);
		result= new ResultSection();
		bs = new BallotSection();	
	}
	
	
	
	

	

}

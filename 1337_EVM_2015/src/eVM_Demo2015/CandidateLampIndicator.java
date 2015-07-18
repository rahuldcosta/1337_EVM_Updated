package eVM_Demo2015;

public class CandidateLampIndicator {

	Boolean candidatelampstatus;
	
	public CandidateLampIndicator() {
		candidatelampstatus=false;
	}

	public Boolean getCandidatelampstatus() {
		return candidatelampstatus;
	}

	public void makeLampOn(Candidateinfo ci) {
		this.candidatelampstatus = true;
		System.out.println("Voted Successfully");
		System.out.printf("for =>[[");
		ci.showdetailsofcandidate();
		System.out.printf("]]");
		System.out.println("");
		//System.out.println("C Lamp on");
	}

	public void makeLampOff() {
		this.candidatelampstatus = false;
		System.out.println("Candidate Lamp Off");
		//System.out.println("C Lamp off");
	}
	
	
	
}

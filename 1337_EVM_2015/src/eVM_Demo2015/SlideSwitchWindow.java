package eVM_Demo2015;

public class SlideSwitchWindow {

	int switchvalue;
	public SlideSwitchWindow(int candidatecount) {
		if(candidatecount>0)
		switchvalue=Math.round(candidatecount/16)+1;
		else
			switchvalue=0;
	}
	public int getSwitchvalue() {
		return switchvalue;
	}
	
	public void setSwitchvalue(int candidatecount) {
		this.switchvalue=Math.round(candidatecount/16)+1;
	}
	
	
	
	

}

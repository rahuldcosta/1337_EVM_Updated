package eVM_Demo2015;

import java.util.ArrayList;

public class ResultSection {

	
	ClosePoll cp;
	ResultofPoll1 res1;
	ResultofPoll2 res2;
	Clear cls;
	public ResultSection() {
		// TODO Auto-generated constructor stub
		
		cp=new ClosePoll();
		res1= new ResultofPoll1();
		res2 = new ResultofPoll2();
		cls= new Clear();
	}
	
	
	public void pressClearButton(Counter cc,ArrayList<Candidateinfo> cinfolist)
	{
		cls.ClearMachineRecords(res1, res2, cc, cinfolist);
	}
	
	public void PressResultPoll1Buttton(ArrayList<Candidateinfo>candi)
	{
		res1.ShowResultsofPoll1(candi);
	}
	
	public void PressResultPoll2Buttton(ArrayList<Candidateinfo>candi)
	{
		res2.ShowResultsofPoll2(candi);
	}
	
	public void ClosePollsButton()
	{
		cp.PressClosePollButton();
	}
	
	public void OpenPollButton()
	{
		cp.startPoll();
	}

}

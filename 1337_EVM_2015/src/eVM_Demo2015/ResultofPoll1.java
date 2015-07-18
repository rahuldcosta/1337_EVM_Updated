package eVM_Demo2015;

import java.util.ArrayList;

public class ResultofPoll1 {

	Boolean viewdonce;
	public ResultofPoll1() {
		// TODO Auto-generated constructor stub
	viewdonce=false;
	}
	
	
	public void ShowResultsofPoll1(ArrayList<Candidateinfo>candi)
	{
		viewdonce=true;
		System.out.println("Results Of Poll 1");
		System.out.println("..................");
		
		for(int i=0;i<candi.size();i++)
		{
			System.out.println("Name:-"+candi.get(i).name+" Symobol:- "+candi.get(i).symbol+" Votes:- "+candi.get(i).myvotes);
		}
	}
	
	
	

}

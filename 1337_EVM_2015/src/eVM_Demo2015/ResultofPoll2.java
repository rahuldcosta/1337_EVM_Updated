package eVM_Demo2015;

import java.util.ArrayList;

public class ResultofPoll2 {

	Boolean viewdonce;
	public ResultofPoll2() {
		// TODO Auto-generated constructor stub
		viewdonce=false;
	}
	
	

	public void ShowResultsofPoll2(ArrayList<Candidateinfo>candi)
	{
		viewdonce=true;
		System.out.println("Results Of Poll 2s");
		System.out.println("..................");
		
		for(int i=0;i<candi.size();i++)
		{
			System.out.println("Name:-"+candi.get(i).name+" Symobol:- "+candi.get(i).symbol+" Votes:- "+candi.get(i).myvotes);
		}
	}
	
	
}

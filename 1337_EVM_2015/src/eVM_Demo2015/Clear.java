package eVM_Demo2015;

import java.util.ArrayList;

public class Clear {

	public Clear() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void ClearMachineRecords(ResultofPoll1 rp1,ResultofPoll2 rp2,Counter cc,ArrayList<Candidateinfo> cinfolist)
	{
		int flag=0;
		if(rp1.viewdonce)
		{
			flag=1;
		}
		else if(rp2.viewdonce)
		{
			flag=1;
		}
		
		if(flag==1)
		{
			cc.resetcounters();
			
			for(int j=0;j<cinfolist.size();j++)
			{
				cinfolist.get(j).resetmycount();
			}
		//	cinfolist.clear();
		}
		
		
	}
	
	
	

}

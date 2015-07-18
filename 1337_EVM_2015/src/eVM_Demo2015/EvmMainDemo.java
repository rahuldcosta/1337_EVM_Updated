package eVM_Demo2015;

import java.util.ArrayList;

public class EvmMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TheEvmMachineFacade EVM= new TheEvmMachineFacade(3);
		
		Candidateinfo c1 = new Candidateinfo("Rahul", "&");
		Candidateinfo c2 = new Candidateinfo("Gaurav", "+");
		Candidateinfo c3 = new Candidateinfo("Nandesh", "*");
		
		ArrayList<Candidateinfo> cis = new ArrayList<Candidateinfo>();
		cis.add(c1);
		cis.add(c2);
		cis.add(c3);
		
		EVM.submitcandidates(cis);
		
		EVM.RequestVoteSequence(1);
		EVM.RequestVoteSequence(2);
		EVM.RequestVoteSequence(2);
		EVM.RequestVoteSequence(3);
		EVM.RequestVoteSequence(1);
		
		EVM.closetheElectionPoll();
		
		EVM.FinalResultsofElection();
		EVM.ResetallCounterofEVM();
		
		
	}

}

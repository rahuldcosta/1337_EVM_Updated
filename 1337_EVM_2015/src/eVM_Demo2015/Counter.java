package eVM_Demo2015;

public class Counter {

	int tvotes;
	public int getTvotes() {
		return tvotes;
	}

	public Counter() {
		tvotes=0;
		// TODO Auto-generated constructor stub
	}

	public void addvote()
	{
		tvotes++;
	}
	
	
	public void resetcounters()
	{
		System.out.println("Reseting the Counters .......");
		tvotes=0;
	}
}

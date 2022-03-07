package spring.core_container;

public class CricketPlayer implements Player {
	int wins;
	int runs;
	int wickets;
	String name;
	private CoachCricket cc;
	public CricketPlayer(CoachCricket cc,int runs,int wins,int wickets,String name)
	{
		this.cc=cc;
		this.runs=runs;
		this.wins=wins;
		this.wickets=wickets;
		this.name=name;
	}

	public void Game() {
		// TODO Auto-generated method stub
    System.out.println("Cricket");
	}

	public void Popularity() {
		// TODO Auto-generated method stub
	System.out.println("No 2 in world");

	}

	public void FamousName() {
		// TODO Auto-generated method stub
	System.out.println("Sachin Tendulkar");
	}

	@Override
	public String toString() {
		return "Cricket";
	}

	public void coachName() {
		// TODO Auto-generated method stub
		cc.coachName();
	}
	

}

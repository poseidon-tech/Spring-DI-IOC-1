package spring.core_container;

public class FootballPlayer implements Player {
	private CoachFootball cf;
	public FootballPlayer(CoachFootball cf)
	{
		this.cf=cf;
	}


	public void Game() {
		// TODO Auto-generated method stub
		System.out.println("Football");

	}

	public void Popularity() {
		// TODO Auto-generated method stub
		System.out.println("No 1 in world");

	}

	public void FamousName() {
		// TODO Auto-generated method stub
		System.out.println("Ronaldo");

	}
	@Override
	public String toString() {
		return "Football";
	}

	public void coachName() {
		// TODO Auto-generated method stub
		cf.coachName();
	}
	

}

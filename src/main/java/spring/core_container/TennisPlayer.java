package spring.core_container;
//Setter injuction
public class TennisPlayer implements Player {
	int rank;
	String name;
	int wins;
	int smack;
	int aces;
	CoachTennis ct;

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getSmack() {
		return smack;
	}

	public void setSmack(int smack) {
		this.smack = smack;
	}

	public int getAces() {
		return aces;
	}

	public void setAces(int aces) {
		this.aces = aces;
	}

	public void Game() {
		// TODO Auto-generated method stub
		System.out.println("Tennis");
	}

	public void Popularity() {
		// TODO Auto-generated method stub
		System.out.println("No 3 in world");
	}

	public void FamousName() {
		// TODO Auto-generated method stub
		System.out.println("Roger Federer");
	}
	
	//Setter object injection
	public void setCoach(CoachTennis ct)
	  {
		this.ct=ct;
	  }

	public void coachName() {
		// TODO Auto-generated method stub
		System.out.println("Marian Vajda");
	}

}

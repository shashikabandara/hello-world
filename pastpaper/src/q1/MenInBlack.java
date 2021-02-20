package q1;

public class MenInBlack {

	private Alien alienpack[];
	private int score=0;
	private int tot=0;
	public MenInBlack(Alien[] alienpack) {
		super();
		this.alienpack = alienpack;
	}
	public Alien[] getAlienpack() {
		return alienpack;
	}
	public void setAlienpack(Alien[] alienpack) {
		this.alienpack = alienpack;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void kill() {
		System.out.println("kill the process");
		//int tot = tot + tot;
	}
	
}

package q1;

public class AlienPack {
	private Alien[] Alien = new Alien[10];
	private int no ;
	private int num;
	public AlienPack(int no) {
		super();
		this.no = no;
	}
	public void addAlien(Alien[] Alien,int num) {
		this.Alien=Alien;
		this.num=num;
	}
	public Alien[] getAliens() {
		return Alien;
		
	}
}

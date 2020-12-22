package SugarSmash;
class SugarSmashPlayer{
	private int ID;
	private String Name;
	protected double[] scores = new double[10];
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getScores(int level) {
		if(level<0 || level>= scores.length) {
			System.out.println("Out of range!!!");
			return -1;
		}else {
			return this.scores[level];
		}
	}
	public void setScores(int score, int level) {
		if(level<0 || level>= scores.length) {
			System.out.println("Out of range!!!");
		}else {
			if(level==0) {
				this.scores[level] = score;
			}else if(scores[level-1]>100) {
				this.scores[level] = score;
			}else {
				System.out.println("Invalid Score");
			}
		}
	}
	
}
class PremiumSugarSmashPlayer extends SugarSmashPlayer{
	protected double[] scores = new double[50];

	public double getScores(int level) {
		if(level<0 || level>= scores.length) {
			System.out.println("Out of range!!!");
			return -1;
		}else {
			return this.scores[level];
		}
	}

	public void setScores(int score, int level) {
		if(level<0 || level>= scores.length) {
			System.out.println("Out of range!!!");
		}else {
			if(level==0) {
				this.scores[level] = score;
			}else if(scores[level-1]>100) {
				this.scores[level] = score;
			}else {
				System.out.println("Invalid Score");
			}
		}
	}
	
}
public class sugarsmashgame {

	public static void main(String[] args) {
		SugarSmashPlayer player = new SugarSmashPlayer();
		System.out.println(player.getScores(1));
		player.setScores(111, 0);
		player.setScores(120, 1);
		System.out.println(player.getScores(1));
		player.setScores(12, 2);

		
		
	}

}

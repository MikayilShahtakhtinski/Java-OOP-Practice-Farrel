package baseball;
class BaseballGame{
	private String team1;
	private String team2;
	private double[] scores1;
	private double[] scores2;
	public BaseballGame(String team1, String team2, int innings) {
		this.team1 = team1;
		this.team2 = team2;
		this.scores1 = new double[innings];
		this.scores2 = new double[innings];
		for(int i = 0 ; i < innings;i++) {
			scores1[i] = -1;
			scores2[i] = -1;
		}
	}
	
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public double getScores1(int inning) {
		return scores1[inning];
	}
	public void setScores1(double score, int inning) {
		boolean beenset = true;
		for(int i = 0 ; i < inning;i++) {
			if(scores1[i]==-1) {
				beenset = false;
				System.out.println("Can't add!!!");
				break;
			}
		}
		if(beenset) {
			this.scores1[inning] = score;
		}
		
	}
	public double getScores2(int inning) {
		return scores2[inning];
	}
	public void setScores2(double score, int inning) {
		boolean beenset = true;
		for(int i = 0 ; i < inning;i++) {
			if(scores1[i]==-1) {
				beenset = false;
				System.out.println("Can't add!!!");
				break;
			}
		}
		if(beenset) {
			this.scores2[inning] = score;
		}
	}
	public void getWinner() {
			double count1 = 0 ;
			double count2 = 0 ;
			for(int i = 0 ; i < this.scores1.length;i++) {
				count1+= scores1[i];
				count2+= scores2[i];
			}
			if(count1>count2) {
				System.out.println("Team 1 wins");
			}else if(count1<count2) {
				System.out.println("Team 2 wins");
			}else {
				System.out.println("Draw");
			}	
	}
		
		
}
class HighSchoolBaseballGame extends BaseballGame{
	private final static int inning = 7;
	public HighSchoolBaseballGame(String team1, String team2) {
		super(team1,team2,inning);
	}
}
class LittleLeagueBaseballGame extends BaseballGame{
	private final static int inning = 6;
	public LittleLeagueBaseballGame(String team1, String team2) {
		super(team1,team2,inning);
	}
}
public class baseballs {

	public static void main(String[] args) {
		HighSchoolBaseballGame hs = new HighSchoolBaseballGame("Fun", "June");
		hs.setScores1(12, 5);
		hs.setScores2(13, 3);
		hs.getWinner();
		hs.setScores1(12, 0);
		hs.getWinner();

		
	}

}

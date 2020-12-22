package SportsTeam;
class Team{
	private String name;
	private String sport;
	private String TeamName;
	public final static String MOTTO = "Sportsmanship!";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	public Team(String name, String sport, String teamName) {
		super();
		this.name = name;
		this.sport = sport;
		TeamName = teamName;
	}
}
class Game {
	private Team team1;
	private Team team2;
	private String time;
	public Team getTeam1() {
		return team1;
	}
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	public Team getTeam2() {
		return team2;
	}
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		if(!team1.getSport().equals(team2.getSport())) {
			this.time = "Game cancelled!";
		}else {
			this.time = time;	
		}
	}
	public Game(Team team1, Team team2, String time) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		setTime(time);
	}
	public String toString(){
		return "The first team : " + team1.getTeamName() + " will compete with second team: "+ team2.getTeamName() + " at " + this.time; 
	}
	
}
public class SportTeam {

	public static void main(String[] args) {
		Team team1 = new Team("UFAZ", "Basketball", "Crazy");
		Team team2 = new Team("BANUM", "Tennis", "Smooth");
		System.out.println(Team.MOTTO);
		System.out.println(team1.getName());
		System.out.println("**Competition**");
		Game game1 = new Game(team1, team2, "5 PM");
		System.out.println(game1.toString());
		
	}

}

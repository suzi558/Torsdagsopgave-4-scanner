import java.util.ArrayList; 

//1.b opret en enhedsklasse kaldet Team.
public class Team {

// 1.c : erklære hold navn
	private String teamName; 

//1.d erklære hold rang
	private int rank; 

//1.e jeg har arrayList fordi den skal holde spillernes navn 
	private ArrayList<String> players; 

//1.f konstruktør til at initialisere teamnavn
public Team (String teamName){
	this.teamName = teamName; 
	this.players = new ArrayList <String> (); 

	}

//1.h setRank metode til at sætte rang 
	public void setRank(int rank){
		this.rank = rank; 
	}

// 1.l metode til at tilføje en spiller 
	public void addPlayer (String playerName){
		this.players.add(playerName); 
	}
//1.j toString metode 
	public String toString (){
		String result = "Team: " + teamName +  ", Rank: " + rank + "\nPlayers:\n" ; 
		for (String player : players){
			result += players + "\n";
		}
		return result;
	}

}

import java.util.ArrayList; 

//4.e opret main klass
public class Main { 
	public static void main (String [] args){

//4.f opret en arraylist og kald den for actions 
		ArrayList<String> actions = new ArrayList<>(); 
		actions.add("1) Start game"); 
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game"); 
 
 	//testing actions list ved at printe pause game 
 		System.out.println(actions.get(2));

 // 4.g instantiate gamemenu klass
 		GameMenu gameMenu = new GameMenu (actions); 

 //4.i test metoden displayMenu 
 		gameMenu.displayMenu(); //her kalder jeg på metoden to displaymenu

	}
}
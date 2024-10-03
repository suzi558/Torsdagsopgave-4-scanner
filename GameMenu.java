import java.util.ArrayList; 

//4.a opret klass GameMenu 
public class GameMenu {

//4.b instance variable 	
	private ArrayList<String> actions; 

//4.c konstruktør med en parameter 
public GameMenu (ArrayList<String> actions){

//4.d tildel listen til instansvariable
	this.actions = actions; 
	} 

//4.h metode to display the menu 
public void displayMenu (){
	for (String action : actions) {

	System.out.println(actions); 

		}
	}

}
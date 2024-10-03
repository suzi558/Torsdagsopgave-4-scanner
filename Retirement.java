import java.util.Scanner; //2.c import scanner class

//2.a create a Main class with a main method.
public class Retirement {
	public static void main (String [] args){

//2.c opret scanner objekt 
	Scanner scanner = new Scanner (System.in); 

//2.b print the message 
	System.out.println( "Pleas type your name"); 

//2.d deklære string variable name 
	String name = scanner.nextLine(); 

//2.e print navnet på brugeren i en hilsen  
	System.out.println ("Hello " + name); 
	System.out.println ("pleas type your age"); 

//2.f deklære int variable age 
	int age = scanner.nextInt(); 

//2.g print brugerns alder 
	System.out.println (" you are " + age + " years old ");

//2.h beregn år til pensionering  
	int Retirement = 67; 
	int yearsToPension = Retirement - age;

System.out.println(" you have " + yearsToPension + " years until retirement "); 

	}
}
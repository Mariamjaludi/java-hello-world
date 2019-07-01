import java.util.Scanner; 

public class myProgram {

	public static void main(String[] args) { //methods
		System.out.println("What is your name?");
		
		//syntax for new object
		//type identifier = new type();
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println("Hello " + name);
		String string = new String("This is a string");
		System.out. println(string + " :) ");
	}
	


}


//class contains everything and has members
//methods - do something
//properties - store something (variables)

//access modifier (public/private) - who can use it
//static - No instance of a class needed (class method)
//object - instance of a class

//parameter and arguments: 
//argument: what you pass into a method
//parameter: variable that will store the data

//expression: evaluates into a value

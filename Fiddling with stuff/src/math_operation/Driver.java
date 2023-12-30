package math_operation;
import java.util.Scanner;
/*Potential ideas:
 Make a driver that can run the choices so driver can be smaller.
 Or we could make the try and catch stuff be run in its respective classes.
 */

public class Driver {
	public static void main(String[]args) {
		Scanner stdIn = new Scanner(System.in);
		int chosen = 0;
		Choice choice = new Choice();// make an choice object, so you can run the operator methods.
		System.out.println("---------------------------------");
		System.out.println("       " + "Arithmetic Operator");
		System.out.println("---------------------------------");
		
		System.out.println("\nWelcome to Arithmetic Operatior!" + "\nTest out all of the possible arithmetic operators!");
		do {
		System.out.println("What would you like to do?");
		System.out.println(" 1 - Add \n 2 - Subtract \n 3 - Multiplication \n 4 - Division \n 5 - Modulo \n 6 - Exponentiation");
		System.out.println("\nChoose one:");
		chosen = stdIn.nextInt();
		}while(chosen < 0 || chosen > 6);
		
		/** Enter a number between 1 -6 and the choice class will start running **/
		if (chosen == 1)
			choice = new Choice(1);
		if (chosen == 2)
			choice = new Choice(2);
		if (chosen == 3)
			choice = new Choice(3);
		if (chosen == 4)
			choice = new Choice(4);
		if (chosen == 5)
			choice = new Choice(5);
		if (chosen == 6)
			choice = new Choice(6);

		stdIn.close();
	}

}

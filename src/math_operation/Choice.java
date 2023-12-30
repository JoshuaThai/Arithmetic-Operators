package math_operation;
import java.util.Scanner;

public class Choice implements Operator{
	int answer = 0;
	
	String ask1 = "first number"; 
	String ask2 = "second number";
	//either it will ask for first/second number or ask for numerator/denominator or ask for base/exponent.
	
	String ans1;// first number to use in STRING for operators
	String ans2;// second number to add in STRING for operators
	int num1 = 0;
	int num2 = 0;
	Scanner stdIn = new Scanner(System.in);
	
	
	public Choice() {//public constructor. Nothing to do here!
		
	}
	public Choice(int x) {// let specifying constructor do all the work.
			boolean done = false;
			if (x == 4 || x == 5) {
				ask1 = "numerator";
				ask2 = "denominator";
			}
			if(x == 6) {
				ask1 = "base number";
				ask2 = "exponent";
			}
			
			do {
				System.out.println("What number would you like to add?");
				System.out.println("Choose a " + ask1 + ":");
				ans1 = stdIn.next();
				
				try {
				num1 = Integer.parseInt(ans1);
				done = true;
				}
				catch(NumberFormatException e){
					System.out.println("Invalid Output. Enter a number.");
				}
			}while(!done);
			
			done = false; // reinitialized to run next try and catch loop.
			do {
				System.out.println("Choose a " + ask2 + ":");
				ans2 = stdIn.next();
					
				try {
				num2 = Integer.parseInt(ans2);
				done = true;
				}
				catch(NumberFormatException e){
					System.out.println("Invalid Output. Enter a number.");
				}
			}while(!done);
			
			
			/**
			 * All of the different choices will call a different method.
			 */
			if(x == 1){//add
				answer = this.add(num1, num2);
			System.out.println("The answer is: " + answer);
			}
			
			if(x == 2){//subtract
				answer = this.subtract(num1, num2);
			System.out.println("The answer is: " + answer);
			}
			
			if(x == 3){//multiply
				answer = this.multiply(num1, num2);
			System.out.println("The answer is: " + answer);
			}
			
			if(x == 4){//division
				answer = this.divide(num1, num2);
				System.out.println("The answer is: " + answer);
			}
			
			if(x == 5){//modulo(ex.) 3%2)
				answer = this.modulo(num1, num2);
			System.out.println("The answer is: " + answer);
			}
			
			if(x == 6){//exponent
				answer = this.exponent(num1, num2);
			System.out.println("The answer is: " + answer);
			}
		}
	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}
	@Override
	public int subtract(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}
	@Override
	public int multiply(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}
	@Override
	public int divide(int x, int y) {/**Right now we cannot divide by 0. We will only get an error. **/
		// TODO Auto-generated method stub
		int e;
		try {
			e = x/y;
		}catch(Exception f)
		{
			System.out.println("Error: Cannot Divide By Zero");
			return 0000000000000000000;
		}
		return e;
	}
	@Override
	public int modulo(int x, int y) {/**Same as above. Modulo by 0 does not work.**/
		// TODO Auto-generated method stub
		int e;
		try {
			e = x%y;
		}catch(Exception f)
		{
			System.out.println("Error: Cannot Divide By Zero");
			return 0000000000000000000;
		}
		return e;
	}
	@Override
	public int exponent(int x, int y) {
		// TODO Auto-generated method stub
		return (int) Math.pow(x, y);
	}

}

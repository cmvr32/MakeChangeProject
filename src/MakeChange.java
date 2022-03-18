import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

double amount = 0;
double tendered = 0; 
double change = tendered - amount;

System.out.print("What is the total sale price: $");
amount = sc.nextDouble();

System.out.print("What amount of money will you use to pay: $");
tendered = sc.nextDouble();
				
if (tendered < amount) {
	System.out.println("I'm sorry you don't seem to have enough funds.");
}

if (tendered == amount) {
	System.out.println("Thank you for your business.");
}

if (tendered > amount) {
	change = tendered - amount; 
	System.out.println("change due: $" + change);
}
	 if (change > 20) {
		double twenties = (change / 20);
		System.out.println(twenties);

	
}






}
}

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double amount = 0;
		double tendered = 0;
		double change = tendered - amount;

		System.out.print("What is the total sale price: $");
		amount = sc.nextDouble();

		System.out.print("What amount of money will you use to pay: $");
		tendered = sc.nextDouble();

		System.out.println("");

		if (tendered < amount) {
			System.out.println("I'm sorry you don't seem to have enough funds.");
		}

		if (tendered == amount) {
			System.out.println("Thank you for your business.");
		}

		if (tendered > amount) {
			change = tendered - amount;
			System.out.println("Total change due: $" + change);
			System.out.println();
			System.out.println("Change recieved: ");
		}

	double twenties = (change / 20);

		if (change > 20) {
			twenties = (change / 20);
			System.out.println((int) twenties + " twenty dollar bill(s)");
		}
	double withoutTwenties = change - ((int) twenties * 20);
	double tens;

		if (withoutTwenties >= 10) {
			tens = (withoutTwenties / 10);
			System.out.println((int) tens + " ten dollar bill(s)");
		}
	tens = (withoutTwenties / 10);
	double withoutTens = withoutTwenties - ((int) tens * 10);
	double fives;

		if (withoutTens >= 5) {
			fives = (withoutTens / 5);
			System.out.println((int) fives + " five dollar bill(s)");
		}

	fives = (withoutTens / 5);
	double withoutFives = withoutTens - ((int) fives * 5);
	double ones;

		if (withoutFives >= 1) {
			ones = (withoutFives / 1);
			System.out.println((int) ones + " one dollar bill(s)");
		}
	ones = (withoutFives / 1);
	double withoutOnes = withoutFives - ((int) ones * 1);
	double quarters;

		if (withoutOnes < 1 && withoutOnes >= .25) {
		quarters = (withoutOnes / .25);
		System.out.println((int) quarters + " quarter(s)");
		}

	quarters = (withoutOnes / .25);

	double withoutQuarters = withoutOnes - ((int) quarters * .25);
	double dimes;

		if (withoutQuarters < .25 && withoutQuarters >= .10) {
		dimes = (withoutQuarters / .10);
		System.out.println((int) dimes + " dime(s)");
		}
		
	dimes = (withoutQuarters / .10);
	double withoutDimes = withoutQuarters - ((int) dimes * .10) + .005;
	double nickles;

		if (withoutDimes < .10 && withoutDimes >= .05) {			
			nickles = (withoutDimes / .05);
			
			System.out.println((int)nickles + " nickle(s)");
	
		}
		
	nickles = (withoutDimes / .05); 
	double withoutNickles = withoutDimes - ((int) nickles * .05);
	double pennies;
	
		if (withoutNickles < .05 && withoutNickles >= .01) {
			pennies = (withoutNickles / .01);
			System.out.println((int)pennies + " pennies");
		}

	}//mainMethod
}//Class

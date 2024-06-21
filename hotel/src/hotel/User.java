
package hotel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Restaurant res = new Restaurant();
		Hotel hi = res.hotel();
		System.out.println("WELCOME TO GRAND HOTEL");
		System.out.println("WOULD YOU LIKE TO SEE THE MENU");
		String ans = scan.next();
		if (ans.equalsIgnoreCase("yes")) {
			System.out.println("TODAYS SPECIAL ARE");
			hi.display();
			try {
			System.out.println("ENTER THE OPTION NUMBER YOU WOULD LIKE TO BUY");
			int i = scan.nextInt();
			System.out.println("WOULD YOU LIKE TO PURCHASE");
			String ans1 = scan.next();
			if (ans1.equalsIgnoreCase("yes")) {
				if (i == 1) {
					System.out.println("CHICKEN PIZZA Rs 200/-");
					System.out.println("enter the amount");
					double amount = scan.nextDouble();
					hi.choice(amount, i);
					hi.exit();
				} else if (i == 2) {
					System.out.println("SANDWICH Rs 80/-");
					System.out.println("enter the amount");
					double amount = scan.nextDouble();
					hi.choice(amount, i);
					hi.exit();
				} else if (i == 3) {
					System.out.println("TOMATO RICE Rs 100/-");
					System.out.println("enter the amount");
					double amount = scan.nextDouble();
					hi.choice(amount, i);
					hi.exit();
				} else if (i == 4) {
					System.out.println("BURGER Rs 150/-");
					System.out.println("enter the amount");
					double amount = scan.nextDouble();
					hi.choice(amount, i);
					hi.exit();
				} else {
					System.out.println("VEG PUFF Rs 80/-");
					System.out.println("enter the amount");
					double amount = scan.nextDouble();
					hi.choice(amount, i);
					hi.exit();

				}

			}
		
			else {
			System.out.println("THANKYOU---VISIT-US-AGAIN");
		}
			}catch(InputMismatchException mc) {
				System.out.println("********YOU HAVE ENTERED THE INVALID OPTION*******ERROR OCCURED******");
			}
	}

		else {
		System.out.println("THANKYOU---VISIT-US-AGAIN");
		}
}
}

package hotel;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
	private class HotelImple implements Hotel {

		Hotel2 h2 = new Hotel2();

		public void display() {

			System.out.println(h2);

		}

		public void choice(double amount, int i) {
			Map<Integer, Double> menuItems = new HashMap<>();
			menuItems.put(1, h2.getChicken());
			menuItems.put(2, h2.getSandwich());
			menuItems.put(3, h2.getTomatorice());
			menuItems.put(4, h2.getBurger());
			menuItems.put(5, h2.getVegpuff());

			if (menuItems.containsKey(i)) {
				double itemPrice = menuItems.get(i);
				if (amount >= itemPrice) {
					double balance = amount - itemPrice;
					System.out.println("The balance is: " + balance);
				} else {
					System.out.println("INSUFFICIENT BALANCE");
				}
			} else {
				System.out.println("Invalid choice");
			}
		}

		public void exit() {
			System.out.println("*****Thank you visit us again***");
		}
	}

	public Hotel hotel() {
		return new HotelImple();
	}

}

package hotel;

public class Hotel2 {

	public String toString() {
		return " 1)chicken=" + chicken + "\n 2)sandwich=" + sandwich + "\n 3)tomatorice=" + tomatorice + "\n 4) burger="
				+ burger + "\n 5)vegpuff=" + vegpuff + "";
	}
	private double chicken=200;
	private double sandwich=80;
	private double tomatorice=100;
	private double burger=150;
	private double vegpuff=80;
	public double getChicken() {
		return chicken;
	}
	public void setChicken(double chicken) {
		this.chicken = chicken;
	}
	public double getSandwich() {
		return sandwich;
	}
	public void setSandwich(double sandwich) {
		this.sandwich = sandwich;
	}
	public double getTomatorice() {
		return tomatorice;
	}
	public void setTomatorice(double tomatorice) {
		this.tomatorice = tomatorice;
	}
	public double getBurger() {
		return burger;
	}
	public void setBurger(double burger) {
		this.burger = burger;
	}
	public double getVegpuff() {
		return vegpuff;
	}
	public void setVegpuff(double vegpuff) {
		this.vegpuff = vegpuff;
	}
	
	
}

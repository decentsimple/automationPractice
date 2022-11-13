package codingexercise.constructorShirt;

public class Shirt {

	public static String color;
	public static char size;
	
	Shirt() {
		System.out.println("this is under class shirt with method shirt constructor");
	}
	
	Shirt(String color, char size) {
		this.color = color;
		this.color = color;
	}
	
	public static void putOn() {
		System.out.println("shirt is On");
	}
	
	public static void takeOff() {
		System.out.println("Shirt is off");
	}
	
	
	public static void setColor(String newColor) {
		color = newColor;
	}
	public static void setSize(char newSize) {
		size = newSize;
	}
}

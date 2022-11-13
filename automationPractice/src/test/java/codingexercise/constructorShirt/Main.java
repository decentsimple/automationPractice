package codingexercise.constructorShirt;

public class Main {
	
	public static void main(String[] args) {
	
		Shirt shirt = new Shirt();
		
		shirt.putOn();
		shirt.takeOff();
		
		shirt.setColor("Black");
		shirt.setSize('M');
		
		System.out.println(shirt.size);
		System.out.println(shirt.color);
		
		Shirt shirt1 = new Shirt("White",'S');
		
		System.out.println(shirt1.size);
		System.out.println(shirt1.color);
		
	}
}

package codingexercise;

public class forloop {

	public static void main(String[] args) {
		int[] mynumbers = {1, 52, 107};
		for (int mynumber : mynumbers) {
			if (mynumber > 100) {
				System.out.println("A");
			} else if (mynumber > 50) {
				System.out.println("B");
			}
		}
	}
}

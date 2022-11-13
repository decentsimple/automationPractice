package codingexercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class InputOneTime_Array_Odd_Even_Results2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] oddNumbers = new int[5];
		int[] evenNumbers = new int[5];
		int evenCounter = 0;
		int oddCounter = 0;
		int minOddNumber = 1;
		int maxEvenNumber = 0;
		int sum = 0;
		int[] input = new int[10];
		System.out.println("Enter 10 random numbers; 5 odd & 5 even numbers please:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter a number:");
			// separate odd and even numbers
			input[i] = scanner.nextInt();
			if (input[i] % 2 == 0) {
				evenNumbers[evenCounter] = input[i];
				evenCounter++;
			} else {
				oddNumbers[oddCounter] = input[i];
				oddCounter++;
			}
		}
		maxEvenNumber = Arrays.stream(evenNumbers).summaryStatistics().getMax();
		minOddNumber = Arrays.stream(oddNumbers).summaryStatistics().getMin();

		System.out.println("1. Highest even number:" + maxEvenNumber);
		System.out.println("2. Lowest odd number:" + minOddNumber);
		sum = oddNumbers[0] + evenNumbers[4];
		System.out.println("3. Sum of the first odd number " + oddNumbers[0] + " and last even number " + evenNumbers[4]
				+ " in the array: " + sum);
	}
}

//maxEvenNumber = evenNumbers[0];
//lowestOddNumber = oddNumbers[0];
/*
 * for (int i=0; i<5; i++) { if (evenNumbers[i] > maxEvenNumber) { maxEvenNumber
 * = evenNumbers[i]; } if (oddNumbers[i] < minOddNumber) { minOddNumber =
 * oddNumbers[i]; } }
 */

/*
 * for (int i=0; i<10; i++) { //System.out.println(input[i]);
 * 
 * //separate odd and even numbers if(input[i] % 2 == 0) {
 * evenNumbers[evenCounter] = input[i];
 * 
 * System.out.println("5 even Numbers inputted:" + evenCounter + ":" +
 * evenNumbers[evenCounter]);
 * 
 * maxEvenNumber = evenNumbers[evenCounter]; if(evenNumbers[evenCounter] >
 * maxEvenNumber) { maxEvenNumber = evenNumbers[evenCounter]; } evenCounter++; }
 * else { oddNumbers[oddCounter] = input[i];
 * 
 * System.out.println("5 odd Numbers inputted:" + oddCounter + ":" +
 * oddNumbers[oddCounter]); lowestOddNumber = oddNumbers[oddCounter];
 * if(oddNumbers[oddCounter] < lowestOddNumber) { lowestOddNumber =
 * oddNumbers[oddCounter]; oddCounter++;
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * 
 * for (int i=0; i<5; i++) { System.out.println("5 even Numbers inputted:");
 * System.out.println(evenNumbers[i]);
 * 
 * }
 * 
 * for (int i=0; i<5; i++) { System.out.println("5 odd Numbers inputted:");
 * System.out.println(oddNumbers[i]);
 * 
 * }
 * 
 * }
 * 
 * 
 * }
 */
// 2 answers
// 1. use of scanner to accept random 5 odd and 5 even numbers 
// 2. accept 1 input with all 10 random 5 odd and 5 even numbers, separated by comma, and will 
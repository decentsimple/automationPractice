package codingexercise;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Array_Odd_Even_Results {

	public static void main(String[] args) {
		// use scanner for user input
		// declarations
		Scanner scanner = new Scanner(System.in);
		// note: 5 only set for odd/even numbers, to throw error when exceeds 5 odd or even number
		int[] input = new int[10], oddNumbers = new int[5], evenNumbers = new int[5]; 
		int evenCounter = 0, oddCounter = 0, sum = 0;
		System.out.println("Enter 10 random numbers; 5 odd & 5 even numbers:");

		for (int i = 0; i < 10; i++) {
			System.out.print("Enter a number:");
			while (!scanner.hasNextInt()) {
				System.out.println("Please enter number only");
				scanner.next();
			}
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
		// Print Results
		System.out.println("1. Highest even number:" + arrayStreamSummaryStatictics(evenNumbers).getMax());
		System.out.println("2. Lowest odd number:" + arrayStreamSummaryStatictics(oddNumbers).getMin());
		sum = oddNumbers[0] + evenNumbers[4];
		System.out.println("3. Sum of the first odd number " + oddNumbers[0] + " and last even number " + evenNumbers[4]
				+ " in the array: " + sum);

		// close scanner
		scanner.close();
	}
	// function of arrays summary statistics to call both min odd and max even numbers
	public static IntSummaryStatistics arrayStreamSummaryStatictics(int[] number) {
		return Arrays.stream(number).summaryStatistics();
	}

}

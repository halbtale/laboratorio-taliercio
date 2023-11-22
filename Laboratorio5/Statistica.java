import java.util.Scanner;

public class Statistica {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean shouldAskForInput = true;
		int numbersSize = 0;
		double[] numbers = new double[10];
		
		while (shouldAskForInput) {
			System.out.print("Inserisci numero decimale: ");
			String input = in.nextLine();
			if (numbersSize >= numbers.length || input.equalsIgnoreCase("")) {
				shouldAskForInput = false;
			} else {
				numbersSize++;
				numbers[numbersSize] = Double.parseDouble(input);
			}
		}
		
		double sum = 0;
		double squareSum = 0;
		
		for (double number : numbers) {
			sum += number;
			squareSum += Math.pow(number, 2);
		}
		
		double average = sum / numbersSize;
		double deviationStandard = 0;
		
		if (numbersSize > 1) {
			deviationStandard = Math.sqrt((squareSum - sum*sum/numbersSize)/(numbersSize-1));
		}
		
		System.out.println(average);
		System.out.println(deviationStandard);		
		
	}
}

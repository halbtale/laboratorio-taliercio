import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class StatisticaPlus {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader = new FileReader("input_double.txt");
		Scanner in = new Scanner(reader);
		
		boolean shouldAskForInput = true;
		int numbersSize = 1;
		double[] numbers = new double[10];
		
		while (shouldAskForInput) {
			String input = in.nextLine();
			if (numbersSize >= numbers.length || input.equalsIgnoreCase("")) {
				shouldAskForInput = false;
			} else {
				try {
					double number = Double.parseDouble(input);
					numbers[numbersSize] = number;
					numbersSize++;
				} catch (NumberFormatException e) {
					
				}
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

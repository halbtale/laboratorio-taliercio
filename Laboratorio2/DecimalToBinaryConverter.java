import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero da convertire in binario nell'intervallo [0, 32]");
        double inputNumber = in.nextDouble();
        if (inputNumber < 0 || inputNumber > 32) {
            System.out.println("Il numero che hai inserito è fuori dal range [0, 32]");
            return;
        }
        NumberBinaryConverter converter = new NumberBinaryConverter(inputNumber);
        System.out.printf("Il numero convertito in notazione decimale è %s%n", converter.getBinaryNumber());
    }
}

class NumberParser {
    private int intPart = 0;
    private double decimalPart = 0;

    NumberParser(double number) {
        intPart = (int) number;
        decimalPart = number - intPart;
    }

    public int getIntPart() {
        return intPart;
    }

    public double getDecimalPart() {
        return decimalPart;
    }
}

class NumberBinaryConverter {
    private String binaryNumber = "";

    NumberBinaryConverter(double base10Number) {
        NumberParser numberParser = new NumberParser(base10Number);
        String binaryInt = getBinaryInt(numberParser.getIntPart());
        String binaryDecimal = getBinaryDecimal(numberParser.getDecimalPart());
        binaryNumber = binaryInt + "." + binaryDecimal;
    }

    private String getBinaryInt(int base10NumberIntPart) {
        String binaryInt = "";
        for (int i = 0; i < 5; i++) {
            binaryInt = base10NumberIntPart % 2 + binaryInt;
            base10NumberIntPart = base10NumberIntPart / 2;
        }
        return binaryInt;
    }

    private String getBinaryDecimal(double base10NumberDecimalPart) {
        String binaryDecimal = "";
        for (int i = 0; i < 5; i++) {
            if (base10NumberDecimalPart > 1) {
                base10NumberDecimalPart = (base10NumberDecimalPart - 1) * 2;
            } else {
                base10NumberDecimalPart = base10NumberDecimalPart * 2;
            }
            NumberParser numberParser = new NumberParser(base10NumberDecimalPart);
            binaryDecimal += numberParser.getIntPart();
        }
        return binaryDecimal;
    }

    public String getBinaryNumber() {
        return binaryNumber;
    }
}
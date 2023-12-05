public class FactorGenerator {
    int currentNumber;

    public FactorGenerator(int numberToFactorize) {
        if (numberToFactorize > 0) {
            currentNumber = numberToFactorize;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int nextFactor() {
        if (currentNumber == 1)
            throw new IllegalStateException();

        int factor = 1;

        for (int i = 2; i <= currentNumber; i++) {
            if (currentNumber % i == 0) {
                factor = i;
                currentNumber = currentNumber / i;
                break;
            }
        }
        return factor;
    }

    public boolean hasNextFactor() {
        return currentNumber > 1;
    }
}

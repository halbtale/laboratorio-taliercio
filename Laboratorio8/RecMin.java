public class RecMin {
    public static void main(String[] args) {
        int dim = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int[] numbers = new int[dim];

        for (int i = 0; i<numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * n) + 1);
        }

        for (int number : numbers) {
            System.out.print(number);
            System.out.print(", ");
        }
        System.out.println("\b");

        System.out.println("Min: "+findMin(numbers));
    }

    private static int findMin(int[] numbers) {
        if (numbers.length == 1) return numbers[0];
        int[] otherNumbers = new int[numbers.length - 1];
        System.arraycopy(numbers, 1, otherNumbers, 0, otherNumbers.length);
        return Math.min(numbers[0], findMin(otherNumbers));
    }
}
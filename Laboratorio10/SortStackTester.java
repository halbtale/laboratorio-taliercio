public class SortStackTester {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 5, 3, 72, 12, 62, 4, 15, 46, 10, 99, 0 };
        Stack stack = new ArrayStack();
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }
        ArrayStack.sortStack(stack);
        System.out.println(stack);
    }
}

public class StackByQueueTester {
    public static void main(String[] args) {
        Stack arrayStack = new ArrayStack();
        Stack stackByQueue = new StackByQueue();

        runTest(arrayStack);
        runTest(stackByQueue);

        if (compareStacks(arrayStack, stackByQueue)) {
            System.out.println("Collaudo riuscito");
        } else {
            System.out.println("Collaudo non riuscito");
        }

    }

    private static void runTest(Stack s) {
        s.push(2);
        s.push("pippo");
        s.top();
        s.pop();
        s.push("pluto");
        s.top();
    }

    private static boolean compareStacks(Stack s1, Stack s2) {
        boolean areEqual = true;
        Stack tempS1 = new ArrayStack();
        Stack tempS2 = new ArrayStack();

        while (!s1.isEmpty() && !s2.isEmpty() && areEqual) {
            Object elS1 = s1.pop();
            Object elS2 = s2.pop();
            if (!elS1.equals(elS2)) {
                areEqual = false;
            }
        }

        if (s1.isEmpty() && !s2.isEmpty() || !s1.isEmpty() && s2.isEmpty())
            areEqual = false;

        while (!tempS1.isEmpty()) {
            s1.push(tempS1.pop());
        }

        while (!tempS2.isEmpty()) {
            s1.push(tempS2.pop());
        }

        return areEqual;
    }
}

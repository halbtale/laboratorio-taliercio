@SuppressWarnings({ "rawtypes", "unchecked" })
public class ArrayStack implements Stack {
    private static final int INIT_ARRAY_SIZE = 100;
    private Object[] array;
    private int arraySize;

    ArrayStack() {
        array = new Object[INIT_ARRAY_SIZE];
        makeEmpty();
    }

    public boolean isEmpty() {
        return arraySize == 0;
    }

    public void makeEmpty() {
        arraySize = 0;
    }

    public void push(Object obj) {
        if (array.length == arraySize)
            throw new FullStackException();
        array[arraySize++] = obj;
    }

    public Object pop() {
        Object lastElement = top();
        arraySize--;
        return lastElement;
    }

    public Object top() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        return array[arraySize - 1];
    }

    public static void sortStack(Stack stack) {
        Stack tempStack = new ArrayStack();

        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }

        while (!tempStack.isEmpty()) {
            Comparable element = (Comparable) tempStack.pop();
            int n = 0;
            while (!stack.isEmpty() && element.compareTo(stack.top()) > 0) {
                tempStack.push(stack.pop());
                n++;
            }
            stack.push(element);
            while (n > 0) {
                stack.push(tempStack.pop());
                n--;
            }
        }
    }

    public String toString() {
        String text = "Stack {";
        for (int i = arraySize - 1; i >= 0; i--) {
            text += array[i] + ", ";
        }
        if (arraySize > 0)
            text += "\b\b";
        text += "}";
        return text;
    }
}

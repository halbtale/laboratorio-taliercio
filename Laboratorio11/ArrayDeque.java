public class ArrayDeque implements Deque {
    protected static int INIT_SIZE = 3;
    protected Object[] array;
    protected int front;
    protected int back;

    ArrayDeque() {
        array = new Object[INIT_SIZE];
    }

    public boolean isEmpty() {
        return front == back;
    }

    public void makeEmpty() {
        front = back = 0;
    }

    public void addFirst(Object obj) {
        if (decrement(front) == back) {
            resize();

            if (front > back) {
                System.arraycopy(array, 0, array, array.length / 2, front);
                back += array.length / 2;
            }
        }
        front = decrement(front);
        array[front] = obj;
    }

    public void addLast(Object obj) {
        if (increment(back) == front) {
            resize();

            if (front > back) {
                System.arraycopy(array, 0, array, array.length / 2, front);
                back += array.length / 2;
            }
        }
        array[back] = obj;
        back = increment(back);
    }

    public Object removeFirst() {
        Object first = getFirst();
        front = increment(front);
        return first;
    }

    public Object removeLast() {
        Object last = getLast();
        back = decrement(back);
        return last;
    }

    public Object getFirst() {
        if (size() == 0)
            throw new EmptyDequeException();
        return array[front];
    }

    public Object getLast() {
        if (size() == 0)
            throw new EmptyDequeException();
        return array[decrement(back)];
    }

    public int size() {
        if (front <= back) {
            return back - front;
        } else {
            return back + (array.length - front);
        }
    }

    public String toString() {
        String output = "ArrayDeque[size=" + size() + ",front=" + front + ",back=" + back + "] {";

        int i;
        for (i = 0; i < size(); i++) {
            output += array[getModularIndex(i + front)] + ", ";
        }
        if (i > 0)
            output += "\b\b";

        output += "}";
        return output;
    }

    private int getModularIndex(int index) {
        int reminder = index % array.length;
        if (reminder < 0)
            reminder += array.length;
        return reminder;
    }

    private int increment(int index) {
        return getModularIndex((index + 1));
    }

    private int decrement(int index) {
        return getModularIndex(index - 1);
    }

    private void resize() {
        Object[] resizedArray = new Object[array.length * 2];
        System.arraycopy(array, 0, resizedArray, 0, array.length);
        array = resizedArray;
    }

}

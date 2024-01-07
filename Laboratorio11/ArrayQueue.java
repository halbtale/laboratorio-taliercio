public class ArrayQueue implements Queue {
    protected final static int INIT_SIZE = 5;
    protected Object[] array;
    protected int front, back;

    ArrayQueue() {
        array = new Object[INIT_SIZE];
        makeEmpty();
    }

    public boolean isEmpty() {
        return front == back;
    }

    public void makeEmpty() {
        front = back = 0;
    }

    public void enqueue(Object obj) {
        if (increment(back) == front) {
            resize();
        }

        array[back] = obj;
        back = increment(back);
    }

    public Object dequeue() {
        if (isEmpty())
            throw new EmptyQueueException();
        Object el = getFront();
        front = increment(front);
        return el;
    }

    public Object getFront() {
        return array[front];
    }

    private int increment(int index) {
        return (index + 1) % array.length;
    }

    private void resize() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
        if (front > back) {
            System.arraycopy(array, 0, array, array.length / 2, back);
            back = back + array.length / 2;
        }
    }

}

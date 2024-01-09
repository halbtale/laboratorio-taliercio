public class QueueByStackTester {
    public static void main(String[] args) {
        Queue arrayQueue = new ArrayQueue();
        Queue queueByStack = new QueueByStack();

        runTest(arrayQueue);
        runTest(queueByStack);

        if (compareQueue(arrayQueue, queueByStack)) {
            System.out.println("Collaudo riuscito");
        } else {
            System.out.println("Collaudo non riuscito");
        }

    }

    private static void runTest(Queue q) {
        q.enqueue(2);
        q.enqueue("pippo");
        q.getFront();
        q.dequeue();
        q.enqueue("pluto");
        q.getFront();
    }

    private static boolean compareQueue(Queue q1, Queue q2) {
        Queue tempQ1 = new ArrayQueue();
        Queue tempQ2 = new ArrayQueue();

        boolean areEqual = true;

        while (!q1.isEmpty() && !q2.isEmpty()) {
            Object el1 = q1.dequeue();
            Object el2 = q2.dequeue();
            if (!el1.equals(el2) || (el1 == null && el2 == null))
                areEqual = false;
            tempQ1.enqueue(el1);
            tempQ2.enqueue(el2);
        }

        while (!q1.isEmpty()) {
            tempQ1.enqueue(q1.dequeue());
            areEqual = false;
        }

        while (!q2.isEmpty()) {
            tempQ2.enqueue(q2.dequeue());
            areEqual = false;
        }

        while (!tempQ1.isEmpty()) {
            q1.enqueue(tempQ1.dequeue());
        }

        while (!tempQ2.isEmpty()) {
            q2.enqueue(tempQ2.dequeue());
        }

        return areEqual;
    }
}

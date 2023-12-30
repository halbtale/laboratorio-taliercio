import java.util.Arrays;

public class SelectionSortRec {
    public static void main(String[] args) {
        int dim = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int[] array = new int[dim];

        for (int i = 0; i<dim; i++) {
            array[i] = (int) (Math.random() * n) + 1;
        }

        recSelectionSort(array, 0);

        System.out.println(Arrays.toString(array));
    }

    private static void recSelectionSort(int[] array, int startIndex) {
        if (startIndex >= array.length) return;
        int min = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex+1; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        array[minIndex] = array[startIndex];
        array[startIndex] = min; 
        recSelectionSort(array, startIndex + 1);
    }
}
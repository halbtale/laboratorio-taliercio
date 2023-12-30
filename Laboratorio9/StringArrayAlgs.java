import java.util.Arrays;

public class StringArrayAlgs {
    public static void main(String[] args) {
        String[] elements = {"puttana", "troia", "vacca", "porca", "sofia"};
        bubbleSort(elements, elements.length);
        System.out.println(Arrays.toString(elements));
    }

    public static void iterativeMergeSort(String[] array, int arraySize) {
        // todo
    }

    public static void bubbleSort(String[] array, int arraySize) {
        for (int startIndex = 0; startIndex < arraySize; startIndex++) {
            for (int i = arraySize-1; i>startIndex; i--) {
                if (array[i].compareTo(array[i-1]) < 0) {
                    String temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static int iterativeBinSearch(String[] array, int arraySize, String searchValue) {
        int startIndex = 0;
        int endIndex = arraySize - 1;
        while (startIndex <= endIndex) {
            int midPosition = (startIndex + endIndex) / 2;
            String midElement = array[midPosition];
            if (searchValue.compareTo(midElement) == 0) {
                return midPosition;
            } else if (searchValue.compareTo(midElement) < 0) {
                endIndex = midPosition - 1;
            } else {
                startIndex = midPosition + 1;
            }
        }
        return -1;
    }
}
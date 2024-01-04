import java.util.Arrays;

public class StringArrayAlgs {
    public static void iterativeMergeSort(String[] array, int arraySize) {
        for (int tempArraySize = 2; tempArraySize<=arraySize; tempArraySize = tempArraySize < arraySize ? tempArraySize * 2 <= arraySize ? tempArraySize * 2 : arraySize : tempArraySize * 2) {
            int numberOfBlocks = arraySize / tempArraySize;
            if (arraySize % tempArraySize != 0) numberOfBlocks++;
            for (int i = 0; i<numberOfBlocks; i++) {
                int startIndex = i*tempArraySize;
                int endIndex = startIndex + tempArraySize;
                if (endIndex > arraySize) endIndex = arraySize;
                int midIndex = (startIndex + endIndex) / 2;
                if ((startIndex + endIndex) % 2 != 0) midIndex++;

                String[] tempOrderedArray = new String[endIndex - startIndex];
                String[] array1 = new String[midIndex - startIndex];
                String[] array2 = new String[endIndex - midIndex];

                System.arraycopy(array, startIndex, array1, 0, array1.length);
                System.arraycopy(array, midIndex, array2, 0, array2.length);

                merge(tempOrderedArray, array1, array2);

                System.arraycopy(tempOrderedArray, 0, array, startIndex, tempOrderedArray.length);

               // System.out.printf("[Debug] Ordered array from %d to %d with mid in %d and size of %d%n", startIndex, endIndex, midIndex, tempArraySize);
            }
        }
    }

    private static void merge(String mainArray[], String array1[], String[] array2) {
        int i = 0, i1 = 0, i2 = 0;

        while (i1 < array1.length && i2 < array2.length) {
            if (array1[i1].compareTo(array2[i2]) < 0) {
                mainArray[i++] = array1[i1++];
            } else {
                mainArray[i++] = array2[i2++];
            }
        }

        while (i1 < array1.length) {
            mainArray[i++] = array1[i1++];
        }

        while (i2 < array2.length) {
            mainArray[i++] = array2[i2++];
        }
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

    public static String[] resize(String[] array, int newLength) {
        String[] newArray = new String[newLength];

        System.arraycopy(array, 0, newArray, 0, Math.min(newLength, array.length));

        return newArray;
    }

    public static String printArray(String[] array, int arraySize) {
        return Arrays.toString(array);
    }
}
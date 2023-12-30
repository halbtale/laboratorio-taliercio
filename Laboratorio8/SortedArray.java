import java.util.NoSuchElementException;

public class SortedArray
{
    private int[] array;
    private int arraySize;
    private static final int INIT_SIZE = 5;

    /*
        Crea un oggetto SortedArray vuoto
    */
    public SortedArray()
    { 
        array = new int[INIT_SIZE];
    }

    /*
        verifica se l'array e` vuoto. Prestazioni O(1)
    */
    public boolean isEmpty()
    {
        return arraySize == 0;
    }

    /*
        Aggiunge il valore value all'array ordinato, conservando l'ordinamento.
        Prestazioni O( n) (prima dell'inserimento l'array e' ordinato!)
    */
    public void add(int value)
    { 
        if (array.length == arraySize) increaseSize();
        arraySize++;
        int i;
        for ( i = arraySize - 1; i > 0 && value < array[i - 1]; i--) {
            array[i] = array[i - 1];
        }
        array[i] = value;
    }

    /*
        Cancella il valore massimo dall'array, e lo restituisce.
        Prestazioni O(1). Lancia NoSuchElementException se l'array e' vuoto
    */
    public int removeMax() throws NoSuchElementException
    { 
        if (arraySize == 0) throw new NoSuchElementException();
        int max = array[arraySize - 1];
        arraySize--;
        return max;
    }

    /*
        Restituisce la media (average) dei valori dell'array
        Prestazioni O( n)
    */
    public double avg()
    { 
        double currentAvg = 0;
        for (int i = 0; i<arraySize; i++) {
            currentAvg += array[i];
        }
        return currentAvg / arraySize; 
    }

    /*
        Cerca un numero value nell'array ordinato (ricerca binaria).
        Prestazioni O(log n). Restituisce l'indice nell'array dell'intero 
        value se questo viene trovato, altrimenti restituisce il valore -1
    */
    public int search(int value)
    { 
        return recSearch(value, 0, arraySize - 1);
    }

    private int recSearch(int searchValue, int startIndex, int endIndex) {
        if (startIndex > endIndex) return -1;
        int midIndex = (startIndex + endIndex) / 2;
        if (array[midIndex] == searchValue) {
            return midIndex;
        } else if (searchValue < array[midIndex]) {
            return recSearch(searchValue, startIndex, midIndex - 1);
        } else {
            return recSearch(searchValue, midIndex + 1, endIndex);
        }
    }

    private void increaseSize() {
        int newSize = arraySize * 2;
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, arraySize);
        array = newArray;
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i< arraySize; i++) {
            s += array[i] + " ";
        }
        if (arraySize > 0) s+="\b";
        s+="]";
        return s;
    }
}
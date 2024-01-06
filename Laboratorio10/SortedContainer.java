import java.util.NoSuchElementException;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class SortedContainer implements Container {
    private static final int INIT_ARRAY_SIZE = 5;
    private Comparable[] array;
    private int arraySize;

    /*
     * Costruisce un contenitore vuoto
     */
    public SortedContainer() {
        array = new Comparable[INIT_ARRAY_SIZE];
        makeEmpty();
    }

    /*
     * Aggiunge l'elemento compObj, ridimensionando l'array se necessario.
     * L'elemento viene inserito in coda all'array e successivamente l'array
     * viene ordinato. Andamento asintotico O(n) (prima dell'inserimento
     * l'array e' ordinato!)
     */
    public void add(Comparable compObj) {
        arraySize++;
        if (array.length == arraySize)
            array = resize(array, arraySize * 2);

        int i;
        for (i = arraySize - 1; i > 0 && compObj.compareTo(array[i - 1]) < 0; i--) {
            array[i] = array[i - 1];
        }

        array[i] = compObj;
    }

    private Comparable[] resize(Comparable[] oldAr, int newLength) throws IllegalArgumentException {
        if (newLength < 0)
            throw new IllegalArgumentException();

        Comparable[] newArray = new Comparable[newLength];
        System.arraycopy(oldAr, 0, newArray, 0, Math.min(oldAr.length, newArray.length));

        return newArray;
    }

    /*
     * restituisce il valore massimo del contenitore (massimo nel senso
     * definito dal metodo compareTo()), e lo cancella dal contenitore.
     * Andamento asintotico O(1).
     * Lancia NoSuchElementException se l'array e' vuoto
     */
    public Comparable removeMax() throws NoSuchElementException {
        if (arraySize == 0)
            throw new NoSuchElementException();
        Comparable max = array[arraySize - 1];
        arraySize--;
        return max;
    }

    public boolean isEmpty() {
        return arraySize == 0;
    }

    public void makeEmpty() {
        arraySize = 0;
    } // completare
}

import java.util.NoSuchElementException;

public class Text implements Container
{
    private static final int INIT_WORDS_SIZE = 5;
    String[] wordsArray;
    int wordsSize;

    /*
        costruisce un contenitore di testo vuoto
    */
    public Text()
    {
        makeEmpty();
    }

    /*
      ... metodi di Container da realizzare ...
    */
   public boolean isEmpty() {
        return wordsSize == 0;
   }

   public void makeEmpty() {
        wordsArray = new String[INIT_WORDS_SIZE];
        wordsSize = 0;
   }

    /*
        restituisce il numero di elementi presenti nel contenitore
    */
    public int size() {
        return wordsSize;
    }

    /*
        aggiunge la parola aWord in coda all'elenco
        se l'elenco e' pieno, ridimensiona l'elenco.
    */
    public void add(String aWord)
    {
        if (wordsSize == wordsArray.length) increaseSize();
        wordsArray[wordsSize++] = aWord;
    }

    private void increaseSize() {
        String[] newWordsArray = new String[wordsArray.length * 2];
        System.arraycopy(wordsArray, 0, newWordsArray, 0, Math.min(newWordsArray.length, wordsArray.length));
        wordsArray = newWordsArray;
    }

    /*
        ordina per fusione l'elenco delle parole.
    */
    public void sort()
    {
        recMergeSort(wordsArray, wordsSize);
    }

    private void recMergeSort(String[] array, int arraySize) {
        int midIndex = arraySize / 2;
        String[] leftArray = new String[midIndex];
        String[] rightArray = new String[arraySize - midIndex];
        System.arraycopy(array, 0, leftArray, 0, leftArray.length);
        System.arraycopy(array, 0, rightArray, 0, rightArray.length);

        recMergeSort(leftArray, leftArray.length);
        recMergeSort(rightArray, rightArray.length);

        sortedMerge(array, leftArray, rightArray);
    }

    private void sortedMerge(String[] array, String[] array1, String[] array2) {
        int i = 0, i1 = 0, i2 = 0;
        while (i1 < array1.length && i2 < array2.length) {
            if (array1[i].compareTo(array2[i2]) < 0) {
                array[i++] = array1[i1++];
            } else {
                array[i++] = array2[i2++];
            }
        }

        while (i1 < array1.length) {
            array[i++] = array1[i1++];
        }

        while (i2 < array2.length) {
            array2[i++] = array2[i2++];
        }
    }

    /*
        restituisce l'ultima parola dell'elenco, rimuovendola
        Lancia NoSuchElementException se l'elenco e' vuoto
    */
    public String removeLast() throws NoSuchElementException
    {
        if (wordsSize == 0) throw new NoSuchElementException();
        String lastWord = wordsArray[wordsSize - 1];
        wordsSize--;
        return lastWord;
    }

}

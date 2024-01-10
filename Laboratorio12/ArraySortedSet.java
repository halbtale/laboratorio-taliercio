public class ArraySortedSet implements SortedSet
{
    public ArraySortedSet()
    {   v = new Comparable[INITSIZE];
        vSize = 0; }
    public void makeEmpty()
    {   vSize = 0; }
    public boolean isEmpty()
    {   return (vSize == 0); }

    public void add(Object x) //metodo di Set
    {   throw new IllegalArgumentException(); }

    public void add(Comparable x) // prestazioni O(n)
    {   if (contains(x)) return;
        if (vSize == v.length)  v = resize(2*vSize);
        //riordinamento per inserimento
        //E` O(n), perche' inseriamo in un array ordinato
        int i = vSize;
        while (i > 0 && v[i-1].compareTo(x) > 0)
        {   v[i] = v[i-1];
            i--;
        }
        v[i] = x;
        vSize++;
    }

    public boolean contains(Object x) //prestaz. O(log n)
    {   return binSearch(0, vSize-1, (Comparable) x);
    }
    private boolean binSearch(int from, int to, Comparable x)
    {   if (from > to) return false;
        int mid = (from + to) / 2; // circa in mezzo
        Comparable middle = v[mid];
        if (middle.compareTo(x) == 0)
        //oppure if (middle.equals(x)), se il metodo
        //equals e` stato realizzato correttamente
            return true; // elemento trovato
        else if (middle.compareTo(x) < 0)  //cerca a destra
            return binSearch(mid + 1, to, x);
        else // cerca a sinistra
            return binSearch(from, mid - 1, x);
    }

    public Comparable[] toSortedArray() // prestaz. O(n)
    {   Comparable[] x = new Comparable[vSize];
        System.arraycopy(v, 0, x, 0, vSize);
        return x; }  // v e` gia` ordinato ...

    public Object[] toArray()  //metodo sovrascritto
    {  return toSortedArray();
        // non deve essere disordinato per forza...
    }

    private Comparable[] resize(int newLength) //metodo ausiliario
    {   if (newLength <v.length) throw new IllegalArgumentException();
        Comparable[] newv = new Comparable[newLength];
        System.arraycopy(v, 0, newv, 0, v.length);
        return newv;
    }

    private Comparable[] v;
    private int vSize;
    private static int INITSIZE = 100;
}


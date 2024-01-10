@SuppressWarnings("unchecked")
public class ArrayDictionary implements Dictionary {
	private static final int INIT_SIZE = 5;
	protected Pair[] array;
	protected int arraySize;
	
	public ArrayDictionary() {
		array = new Pair[5];
		makeEmpty();
	}
	
	public void makeEmpty() {
		arraySize = 0;
	}
	
	public boolean isEmpty() {
		return arraySize == 0;
	}

	public void insert(Comparable key, Object value) {
		if (key == null) throw new IllegalArgumentException();
		try {
			remove(key);
		} catch (DictionaryItemNotFoundException e) {};
		if (arraySize == array.length) array = resize(2*arraySize);
		array[arraySize++] = new Pair(key, value);
	}
	
	public void remove(Comparable key) {
		array[linearSearch(key)] = array[--arraySize];
	}
	
	public Object find(Comparable key) {
		return array[linearSearch(key)].getValue();
	}
	
	private int linearSearch(Comparable key) {
		for (int i = 0; i<arraySize; i++) {
			if (array[i].key.compareTo(key) == 0) return i;
		}
		throw new DictionaryItemNotFoundException();
	}
	
	public class Pair {
		public Pair(Comparable key, Object value)
        {   setKey(key); 
            setValue(value); 
        }
        //metodi pubblici
        public String toString()
        {  return key + " " + value; } 
        public Comparable getKey()
        {  return key; }
        public Object getValue()
        {  return value; }
        public void setKey(Comparable key)
        {  this.key = key; }
        public void setValue(Object value)
        {  this.value = value; } 
        //campi di esemplare
        private Comparable key; 
        private Object value;
	}
	
	public String toString()
    {   String s = "";
        for (int i = 0; i < arraySize; i++)
            s = s + array[i] + "\n";
        return s;
    }
    
    protected Pair[] resize(int newLength) //metodo ausiliario
    {   if (newLength <array.length) throw new IllegalArgumentException();
        Pair[] newv = new Pair[newLength];
        System.arraycopy(array, 0, newv, 0, array.length);
        return newv;
    }
}


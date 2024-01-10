@SuppressWarnings("unchecked")
public class SortedArrayDictionary extends ArrayDictionary {

	// O(n)
	public void insert(Comparable key, Object value) {
		if (key == null) throw new IllegalArgumentException();
		try {
			remove(key);
		} catch (DictionaryItemNotFoundException e) {}
		if (arraySize == array.length) array = resize(arraySize * 2);
		
		arraySize++;
		
		int i;
		for (i = arraySize - 1; i > 0 && array[i - 1].getKey().compareTo(key) > 0; i--) {
			array[i] = array[i - 1];
		}
		
		array[i] = new Pair(key, value); 
	}
	
	public void remove(Comparable key) {
		int elIndex = binSearch(key, 0, arraySize);
		
		arraySize--;
		
		for (int i = elIndex; i < arraySize; i++) {
			array[i] = array[i+1];
		}
	}
	
	public Object find(Comparable key) {
		return array[binSearch(key, 0, arraySize)].getValue();
	}
	
	private int binSearch(Comparable searchKey, int front, int back) {
		if (front > back) throw new DictionaryItemNotFoundException();
		int mid = (front + back) / 2;
		Pair midElement = array[mid];
		if (midElement == null) throw new DictionaryItemNotFoundException();
		if (midElement.getKey().compareTo(searchKey) == 0) return mid;
		else if (midElement.getKey().compareTo(searchKey) > 0) {
			return binSearch(searchKey, front, mid-1);
		} else {
			return binSearch(searchKey, mid+1, back);
		}
	}
	
}

import java.util.Scanner;

public class TextContainer
{
	private final int DEFAULT_LINES_SIZE = 1000;
	private String[] lines;
	private int linesSize = 0;
    /*
    costruttore di un contenitore di testo vuoto
    */
    public TextContainer()
    {
    	lines = new String[DEFAULT_LINES_SIZE];
    }

    /*
      verifica se il testo e` vuoto, restituisce
      true se l'oggetto non contiene testo, false altrimenti
    */
    public boolean isEmpty()
    {
    	return linesSize == 0;
   	}

    /*
      aggiunge la stringa "stringa" in coda al testo. Termina senza errori
      se String stringa e` uguale a null.
    */
    public void add(String stringa)
    {
    	if (stringa != null) {
    		lines[linesSize++] = stringa;
    	} 
    }

    /*
     conta e restituisce il numero di stringhe nel testo
    */
    public int count()
    {
    	return linesSize;
    }

    /*
     separa le stringhe del testo in parole. Crea un nuovo oggetto di classe
     TextContainer in cui tutte le parole sono separate, e ne restituisce il
     riferimento. Usa l'insieme di delimitatori di default di Scanner, ovvero
     "\p{JavaWhitespace" (si veda la documentazione di Scanner, in particolare
     dei metodi delimiter e useDelimiter, e la documentazione della classe
     Pattern)
    */
    public TextContainer splitWords()
    {
    	TextContainer wordsContainer = new TextContainer();
    	
    	for (int i = 0; i<linesSize; i++) {
    		String line = lines[i];
	    	Scanner scan = new Scanner(line);
	    	
	    	while (scan.hasNext()) {
	    		String word = scan.next();
	    		wordsContainer.add(word);
	    	}
	    	
	    	scan.close();
    	}
    	
    	return wordsContainer;
    }

    /*
     separa le stringhe del testo in parole. Crea un nuovo oggetto di classe
     TextContainer in cui tutte le parole sono separate, e ne restituisce il
     riferimento. Usa l'insieme di delimitatori specificato dalla stringa delim
     (si veda la documentazione di Scanner, in particolare dei metodi delimiter
     e useDelimiter, e la documentazione della classe Pattern)
    */
    public TextContainer splitWords(String delimiter)
    {
    	TextContainer wordsContainer = new TextContainer();
    	
    	for (int i = 0; i<linesSize;i++) {
    		String line = lines[i];
	    	Scanner scan = new Scanner(line);
	    	scan.useDelimiter(delimiter);
	    	
	    	while (scan.hasNext()) {
	    		String word = scan.next();
	    		wordsContainer.add(word);
	    	}
	    	
	    	scan.close();
    	}
    	
    	return wordsContainer;
    }
    /*
     Crea un nuovo oggetto di di tipo TextContainer in cui tutte le occorrenze
     della stringa "stringa" sono state eliminate.
     - Se la stringa compare piu` volte vengono eliminate tutte le occorrenze.
     - Lancia IllegalArgumentException se il parametro esplicito e` null.
     Attenzione: si devono scandire tutte le stringhe del testo perche`
     la parola da cancellare puo` comparire piu` volte nel testo.
    */
    public TextContainer remove(String stringa)
    {
    	if (stringa == null) throw new IllegalArgumentException();
    	TextContainer wordsContainer = new TextContainer();
    	
    	for (int i = 0; i<linesSize;i++) {
    		String line = lines[i];
	    	Scanner scan = new Scanner(line);
	    	
	    	while (scan.hasNext()) {
	    		String word = scan.next();
	    		if (!word.equals(stringa)) {
					wordsContainer.add(word);	    		
	    		}
	    	}
	    	
	    	scan.close();
    	}
    	
    	return wordsContainer;
    }

    /*
      Restituisce il numero di occorrenze nel testo della stringa "stringa".
      Lancia IllegalArgumentException se il parametro esplicito e` null.
    */
    public int frequency(String stringa)
    {
    	int counter = 0;
    	
    	if (stringa == null) throw new IllegalArgumentException();
    	TextContainer words = splitWords();
    	
    	for (int i = 0; i<words.linesSize; i++) {
    		if (words.lines[i].equals(stringa)) counter++;
    	}
    	
    	return counter;
    }

    /*
      restituisce la stringa che compare piu` volte nel testo (frequenza massima).
      Se piu` stringhe hanno frequenza massima, ne restituisce una qualsiasi.
      Se il testo e` vuoto restituisce null.
    */
    public String maxFrequency()
    { 
    	TextContainer words = splitWords();
    	int maxFrequency = 0;
    	String maxFrequencyWord = "";
    	
    	for (int i = 0; i<words.linesSize; i++) {
    		int wordFrequency = frequency(words.lines[i]);
    		if (wordFrequency > maxFrequency) {
    			maxFrequency = wordFrequency;
    			maxFrequencyWord = words.lines[i];
    		}
    	}
    	
    	return maxFrequencyWord;
    }

    /*
      restituisce la prima stringa del testo in ordine lessicografico.
      Se il testo e` vuoto restituisce null.
    */
    public String min()
    {
    	TextContainer words = splitWords();
    	String minWord = words.lines[0];
    	
    	for (int i = 1; i<words.linesSize; i++) {
    		String currentWord = words.lines[i];
    		
    		if (currentWord.compareTo(minWord) < 0) {
    			minWord = currentWord;
    		}
    	}
    	
    	return minWord;
    }

    /*
      restituisce l'ultima stringa del testo in ordine lessicografico.
      Se il testo e` vuoto restituisce null.
    */
    public String max()
    { 
    	TextContainer words = splitWords();
    	String maxWord = words.lines[0];
    	
    	for (int i = 1; i<words.linesSize; i++) {
    		String currentWord = words.lines[i];
    		
    		if (currentWord.compareTo(maxWord) > 0) {
    			maxWord = currentWord;
    		}
    	}
    	
    	return maxWord;
    }

    /*
      trasforma il testo in stringa. Viene inserito un carattere di nuova riga (\n)
      fra le stringhe. Se il testo e` vuoto restituisce la stringa vuota "".
    */
    public String toString()
    { 
    	String text = "";
    	
    	for (int i = 0; i<linesSize;i++) {
    		text += lines[i] + "\n";
    	}
    	
    	return text;
    }
    /*
      crea un nuovo oggetto di tipo TextContainer in cui tutti i caratteri non
      alfabetici sono stati eliminati dalle stringhe del testo. Ad esempo elimina
      la punteggiatura, i numeri, le parentesi. Usa il metodo
      java.lang.Character.isLetter(char c)
    */
    public TextContainer onlyLetters()
    {
    	TextContainer newTextContainer = new TextContainer();
    	
    	for (int i = 0; i<linesSize;i++) {
    		String line = lines[i];
    		String newLine = "";
    		for (int j = 0; j<line.length(); j++) {
    			char c = line.charAt(j);
    			if (Character.isLetter(c)) {
    				newLine += c;
    			}
    		}
	    	newTextContainer.add(newLine);
    	}
    	
    	return newTextContainer;
    }

    /*
     crea un nuovo oggetto di tipo TextContainer nel quale tutti i caratteri
     maiuscoli sono stati convertiti in minuscoli.
    */
    public TextContainer toLowerCase()
    {
    	TextContainer newTextContainer = new TextContainer();
    	
    	for (int i = 0; i<linesSize;i++) {
    		String line = lines[i];
	    	newTextContainer.add(line.toLowerCase());
    	}
    	
    	return newTextContainer;
    }

    /*
     crea una copia dell'oggetto TextContainer, e ne restituisce il riferimento
    */
    public TextContainer copy()
    {
    	TextContainer copiedTextContainer = new TextContainer();
    	for (int i = 0; i<linesSize;i++) {
    		String line = lines[i];
    		copiedTextContainer.add(line);
    	}
    	return copiedTextContainer;
    }

}

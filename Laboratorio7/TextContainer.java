public class TextContainer
{
	private final DEFAULT_LINES_SIZE = 1000;
	private String[] lines;
    /*
    costruttore di un contenitore di testo vuoto
    */
    public TextContainer()
    {
    	new String[DEFAULT_LINES_SIZE];
    }

    /*
      verifica se il testo e` vuoto, restituisce
      true se l'oggetto non contiene testo, false altrimenti
    */
    public boolean isEmpty()
    {  //completare   }

    /*
      aggiunge la stringa "stringa" in coda al testo. Termina senza errori
      se String stringa e` uguale a null.
    */
    public void add(String stringa)
    {  //completare   }

    /*
     conta e restituisce il numero di stringhe nel testo
    */
    public int count()
    {  //completare   }

    /*
     separa le stringhe del testo in parole. Crea un nuovo oggetto di classe
     TextContainer in cui tutte le parole sono separate, e ne restituisce il
     riferimento. Usa l'insieme di delimitatori di default di Scanner, ovvero
     "\p{JavaWhitespace" (si veda la documentazione di Scanner, in particolare
     dei metodi delimiter e useDelimiter, e la documentazione della classe
     Pattern)
    */
    public TextContainer splitWords()
    {  //completare   }

    /*
     separa le stringhe del testo in parole. Crea un nuovo oggetto di classe
     TextContainer in cui tutte le parole sono separate, e ne restituisce il
     riferimento. Usa l'insieme di delimitatori specificato dalla stringa delim
     (si veda la documentazione di Scanner, in particolare dei metodi delimiter
     e useDelimiter, e la documentazione della classe Pattern)
    */
    public TextContainer splitWords(String delim)
    {  //completare   }

    /*
     Crea un nuovo oggetto di di tipo TextContainer in cui tutte le occorrenze
     della stringa "stringa" sono state eliminate.
     - Se la stringa compare piu` volte vengono eliminate tutte le occorrenze.
     - Lancia IllegalArgumentException se il parametro esplicito e` null.
     Attenzione: si devono scandire tutte le stringhe del testo perche`
     la parola da cancellare puo` comparire piu` volte nel testo.
    */
    public TextContainer remove(String stringa)
    {  //completare   }

    /*
      Restituisce il numero di occorrenze nel testo della stringa "stringa".
      Lancia IllegalArgumentException se il parametro esplicito e` null.
    */
    public int frequency(String stringa)
    {  //completare   }

    /*
      restituisce la stringa che compare piu` volte nel testo (frequenza massima).
      Se piu` stringhe hanno frequenza massima, ne restituisce una qualsiasi.
      Se il testo e` vuoto restituisce null.
    */
    public String maxFrequency()
    {  //completare   }

    /*
      restituisce la prima stringa del testo in ordine lessicografico.
      Se il testo e` vuoto restituisce null.
    */
    public String min()
    {  //completare   }

    /*
      restituisce l'ultima stringa del testo in ordine lessicografico.
      Se il testo e` vuoto restituisce null.
    */
    public String max()
    {  //completare   }

    /*
      trasforma il testo in stringa. Viene inserito un carattere di nuova riga (\n)
      fra le stringhe. Se il testo e` vuoto restituisce la stringa vuota "".
    */
    public String toString()
    {  //completare   }

    /*
      crea un nuovo oggetto di tipo TextContainer in cui tutti i caratteri non
      alfabetici sono stati eliminati dalle stringhe del testo. Ad esempo elimina
      la punteggiatura, i numeri, le parentesi. Usa il metodo
      java.lang.Character.isLetter(char c)
    */
    public TextContainer onlyLetters()
    {  //completare   }

    /*
     crea un nuovo oggetto di tipo TextContainer nel quale tutti i caratteri
     maiuscoli sono stati convertiti in minuscoli.
    */
    public TextContainer toLowerCase()
    {  //completare   }

    /*
     crea una copia dell'oggetto TextContainer, e ne restituisce il riferimento
    */
    public TextContainer copy()
    {  //completare   }

}

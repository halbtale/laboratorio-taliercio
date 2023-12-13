public class Tris
{
	private char[][] state;
	private int notEmptyCellsCount = 0;
	
   /* costruttore che crea (ma non visualizza!)
      la scacchiera con i puntini
   */
   public Tris()
   { 
   		state = new char[3][3];
   		
   		for (int rowIndex = 0; rowIndex<state.length;rowIndex++) {
   			for (int columnIndex = 0; columnIndex<state[rowIndex].length; columnIndex++) {
   				state[rowIndex][columnIndex] = '.';
   			}
   		}
   }

   /* restituisce una stringa da usare per visualizzare la scacchiera
      (deve contenere anche i caratteri per andare a capo al termine
      di ognuna delle tre righe)
   */
   public String toString()
   { 
   		String text = "";
   		
   		for (int rowIndex = 0; rowIndex<state.length;rowIndex++) {
   			text += "[";
   			
   			for (int columnIndex = 0; columnIndex<state[rowIndex].length; columnIndex++) {
   				char cell = state[rowIndex][columnIndex];
   				text += cell; 
   			}
   			
   			text += "]\n";
   		}
   		
   		return text;
   }

   /* imposta la posizione [row][column] al valore c;
      lancia IllegalArgumentException se le coordinate sono errate;
      restituisce false se e solo se la posizione era gia' occupata
   */
   public boolean setCharInPosition(int row, int column, char c)
   {  //completare   
   		if (getCharInPosition(row, column) == '.') {
   			state[row][column] = c;
   			notEmptyCellsCount++;
   			return true;
   		} else {
   			return false;
   		}
   }

   /* restituisce il carattere presente nella posizione [row][column];
      lancia IllegalArgumentException se le coordinate sono errate
   */
   public char getCharInPosition(int row, int column) throws IllegalArgumentException
   {  //completare   
   		try {
	   		return state[row][column];	
   		} catch (Exception e) {
   			throw new IllegalArgumentException();
   		}
   }

   /* restituisce il numero di posizioni occupate nella scacchiera
   */
   public int getCount()
   {  //completare   
   		return notEmptyCellsCount;
   }

   /* restituisce true se e solo se esiste nella scacchiera una
      configurazione vincente per il carattere c
   */
   public boolean isWinning(char c)
   {  //completare   
   		boolean isWinning = false;
   		// check winning rows
   		for (int rowIndex = 0; rowIndex<3;rowIndex++) {
   			boolean matches = true;
   			for (int columnIndex = 0; columnIndex<3; columnIndex++) {
   				if (state[rowIndex][columnIndex] != c) {
   					matches = false;
   					break;
   				}
   			}
   			if (matches) isWinning = matches;
   		}
   		
   		// check winning columns
   		for (int columnIndex = 0; columnIndex<3;columnIndex++) {
   			boolean matches = true;
   			for (int rowIndex = 0; rowIndex<3; rowIndex++) {
   				if (state[rowIndex][columnIndex] != c) {
   					matches = false;
   					break;
   				}
   			}
   			if (matches) isWinning = matches;
   		}
   		
   		// check diagonals
   		if (state[0][0] == c && state[1][1] == c && state[2][2] == c || state[0][2] == c && state[1][1] == c && state[2][0] == c) {
   			isWinning = true;
   		}
   		
   		return isWinning;
   }
   
   public boolean isEnded(char c1, char c2) {
   		return isWinning(c1) || isWinning(c2) || getCount() == 9;
   }
}

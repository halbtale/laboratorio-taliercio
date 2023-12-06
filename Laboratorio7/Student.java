public class Student {
	private String cognome;
	private int votoProvaScritta;
	private int votoProvaOrale;
	
	public Student(String cognome, int votoProvaScritta, int votoProvaOrale) {
		this.cognome = cognome;
		this.votoProvaScritta = votoProvaScritta;
		this.votoProvaOrale = votoProvaOrale;
	}
	
	public String getCognome() {
		return cognome;
	} 
	
	public double getVotoMedio() {
		return ((double) (votoProvaScritta + votoProvaOrale))/2;
	}
	
	public String toString() {
		return cognome + " con voto medio di " + getVotoMedio();
	}
}

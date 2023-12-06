import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {
		final int MAX_STUDENTS_NUMBER = 1000;
		Student[] students = new Student[MAX_STUDENTS_NUMBER];
		int studentsSize = 0;
		
		boolean shouldAskForPrompt = true;
		
		Scanner in = new Scanner(System.in);
		
		while (shouldAskForPrompt) {
			System.out.print("Inserisci [cognome] [votoScritto] [votoOrale] 😀️: ");
			
			String input = in.nextLine();
			
			if (!input.equals("")) {
				Scanner scan = new Scanner(input);
				
				try {
					String cognome = scan.next();
					int votoScritto = Integer.parseInt(scan.next());
					int votoOrale = Integer.parseInt(scan.next());
					
					Student newStudent = new Student(cognome, votoScritto, votoOrale);
					students[studentsSize++] = newStudent;
				} catch (NumberFormatException e) {
					System.out.println("Il formato dell'input non e' valido");
				}
				scan.close();
			} else {
				System.out.println("");
				shouldAskForPrompt = false;
			}
		}
		
		String command = "";
		
		do {
			System.out.print("Inserisci un comando (Q S): ");
			command = in.nextLine(); 
			if (command.equalsIgnoreCase("S")) {
				System.out.print("Inserisci cognome: ");
				String cognome = in.nextLine();
				Student foundStudent = searchStudent(students, studentsSize, cognome);
				if (foundStudent != null) {
					System.out.println(foundStudent);
				} else {
					System.out.println("studente non trovato");
				}
			}
		} while (!command.equalsIgnoreCase("Q"));
		
		in.close();
	}
	
	private static Student searchStudent(Student[] students, int studentsSize, String searchCognome) {
		for (int i = 0; i<studentsSize; i++) {
			Student currentStudent = students[i];
			if (currentStudent.getCognome().equals(searchCognome)) {
				return currentStudent;
			}
		}
		return null;
	}
}

import java.util.Scanner;
public class while_prog {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in); 
		
		String name = ""; 
		while(name.isBlank()) {
			System.out.println("Enter your name: ");
			name = scanner.nextLine(); 
		}
		System.out.println("Hello "+ name);
		scanner.close(); 
	}
}


import java.util.Scanner;
public class array {
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] cars = {"Camero", "Corvette","Tesla"}; 
		
		cars[0] = "Mustang"; 
		System.out.println(cars[2]);
		System.out.println("------------------------");
		
		// another method 
		String[] bikes = new String[3]; 
		bikes[0] = "Honda"; 
		bikes[1] = "R15"; 
	    bikes[2] = "Ninja"; 
	    
	    for(int i =0; i<cars.length; i++) {
	    	System.out.println(cars[i]);
	    }
				
	}
}
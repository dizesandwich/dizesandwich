package stuff;
import java.util.Scanner;
public class CengageAscendingAndDescending {

	public static void main(String[] args) {
		
		int large = 0;
		int middle = 0;
		int small = 0;
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter an integer...");
		int integer1 = console.nextInt();
		
		System.out.println("And another...");
		int integer2 = console.nextInt();
		if (integer1 > integer2) {
			
			middle = integer1;
			small = integer2;
			
		} else {
			
			middle = integer2;
			small = integer1;
			
		}
		
		System.out.println("And just one more...");
		int integer3 = console.nextInt();
		console.close();
		if (integer3 > small) {
			
			if (integer3 > middle) {
				
				large = integer3;
				
			} else {
				
				large = middle;
				middle = integer3;
				
			}
					
			
		} else {
			
			large = middle;
			middle = small;
			small = integer3;
			
			
		}
		
		
		System.out.println("Ascending: "+small+" "+middle+" "+large);
		System.out.println("Descending: "+large+" "+middle+" "+small);
		
	}

}

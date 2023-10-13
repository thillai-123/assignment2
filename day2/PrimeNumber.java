package week1.day2;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int input=7;
	
		for (int i = 2; i <= input/2; i++) {
			
		if(input % i== 0) {
			
				
			System.out.println(input+ " is prime number");
			
			break;
			
			}
			else {
				System.out.println(input+ " is not a prime number");
			}
				
		}
	}
}



package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {

		int range = 0;
		int i = 0;
		int j = 1;
		int sum;
		
		while(range < 8) {
			
			System.out.print( i + " ");
			
			sum = i + j;
			
			i = j;
			j = sum;
			
			range++;
			
		}
		
		
		
		
	}

}

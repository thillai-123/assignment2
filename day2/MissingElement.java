package week1.day2;

import java.util.Arrays;

public class MissingElement {
	
	public static void main(String[] args) {
		
		int num[]= {2,3,4,5,6,8};
		
		Arrays.sort(num);
		int missing = num[0];
		
		for (int i = 0; i < num.length; i++) {
			
			if(missing != num[i]) {
				
				System.out.println(missing);
				
				break;
			}
			
			missing++;
		}
		
		
	}

}

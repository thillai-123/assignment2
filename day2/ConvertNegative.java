package week1.day2;

public class ConvertNegative {

	public static void main(String[] args) {

		   int num = -40, out;
		   
		   System.out.println("The input number is " + num);
			
				if(num>0) {
					System.out.println("The number is positive");
					
				}
				else if(num<0) {
					System.out.println("The number is negative");
					out = num * -1;
					System.out.println("The " + num + " is converted to " + out);
				}
				else {
					System.out.println("The number is neither positive nor negative");
				}
				
				
		
	}

}

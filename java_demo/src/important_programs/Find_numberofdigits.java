package important_programs;

public class Find_numberofdigits {

	public static void main(String[] args) {
		
		
		int num = 123456789;
		
		int count = 0;
		
		while(num>0) {
			
			
			num = num/10;
			
			count++;
			
		
		}

		System.out.println("number of digits :"+ count++);
		
	}

}

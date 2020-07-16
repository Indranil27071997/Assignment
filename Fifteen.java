package indranil;

import java.util.Scanner ;

public class Fifteen {
	public static void main(String[] args) {
		int num =0 ;
		int rem = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your preferred choice of multi-digit number");
		num = sc.nextInt();
		
		while(num>0) {
			
			rem = num % 10;
			sum = sum + rem;
			num = num/10 ;
		}
		
		System.out.println("The sum of digits are = " + sum);
	}

}

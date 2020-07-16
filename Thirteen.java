package indranil;

import java.util.Scanner;

public class Thirteen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int fact = 1;
		
		System.out.println("Please enter the number that you want to find the factorial for :");
		num = sc.nextInt();
		for(int i=1; i<= num ; i++) {
			
				 fact = fact * i;
				
			
			
		}
		System.out.println("Factorial = " + fact);
	}
}
			
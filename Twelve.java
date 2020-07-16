package indranil;
import java.util.Scanner;
public class Twelve {
	public static void main(String[] args) {
		int num = 0;
		int num1 = 0;
		int rem = 0;
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the multi digit number to be reversed :");
		num1 = sc.nextInt();
		num= num1;
	while(num>0) {
		rem = num% 10;
		num = num/10;
		rev = (rev*10) + rem ;
		
		
	}
	if(num1 == rev) {
		
		System.out.println("Palindrome");
		}
	else {
		System.out.println("Not a palindrome");
		}
	}

}

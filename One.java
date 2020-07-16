package indranil;
import java.util.Scanner;
public class One {
	public static void main(String[] args) {
		int num = 0; 
		int rem = 0;
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the multi digit number to be reversed :");
		num = sc.nextInt();
		
	while(num>0) {
		rem = num% 10;
		num = num/10;
		rev = rev + rem ;
		
		
	}
	System.out.println(rev);
	}

}
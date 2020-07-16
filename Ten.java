package indranil;
import java.util.Scanner ;
public class Ten {

	public static void main(String[] args) {
		int n=0;
		int f = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :");
		n = sc.nextInt();
		 if(n==0||n==1){  
			   System.out.println(n+" is not prime number");      
			  }else{  
			   for(int i=2;i<=(n/2);i++){      
			    if(n%i==0){      
			     System.out.println(n+" is not prime number");      
			      f=1;      
			     break;      
			    }      
			}      
		    if(f==0)  { System.out.println(n+" is prime number"); }  
		}
	}    
}   
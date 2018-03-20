import java.util.Scanner;

public class TestFibonacci {
	
	public static int fibonacci(int n){
		
		int i, a = 0, b = 1, c;
		  
		  for (i = 2 ; i <= n; i++) {
		    c = a + b;
		    a = b;
		    b = c;
		  }
		  return b;
		}
	
	public static void main(String[] args)
	{
		System.out.println("Choisissez le rang N à afficher");
		Scanner questionUser = new Scanner(System.in);
		System.out.println(fibonacci(questionUser.nextInt()));
	}

}

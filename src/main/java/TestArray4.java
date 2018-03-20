import java.util.Arrays;
import java.util.Scanner;

public class TestArray4 {
	public static void main(String[] args){

		
		int[] array = new int[0];
		int temp = 0;
		boolean a = true;
		
		while(a)
		{
			System.out.println("Option 1 : Ajouter un nombre");
			
			System.out.println("Option 2 : Afficher les nombres existants");
			
			Scanner option = new Scanner(System.in);
			int selection = option.nextInt();
			
			if(selection==1)
			{
				if(temp==array.length)
				{
					array = Arrays.copyOf(array, (array.length+1));
				}
				
				System.out.println("Saisissez un nombre à entrer dans le tableau?");
				Scanner choixNombre = new Scanner(System.in);
				array[temp] = choixNombre.nextInt();	
				++temp;
			}
			if(selection==2)
			{
				System.out.println(Arrays.toString(array));
			}
		}
	}

}

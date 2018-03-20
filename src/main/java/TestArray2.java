
public class TestArray2 {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		System.out.println("Moyenne");
		int valMoy = 0;
		for (int i = 0; i < array.length ; i++)
		{
			valMoy = valMoy + array[i];		
		}
		System.out.println(valMoy/array.length);
		
		System.out.println("index dans le tableau de l’entier 15 :");
		int valIndex= 15;
		for (int i = 0; i < array.length ; i++)
		{
			if (valIndex == array[i])
			{
				System.out.println(i);
			}				
		}
		
		System.out.println("Nombre d'entier en doublon");
		int dbl =0;
		
		for (int i = 0; i < (array.length-1) ; i++)
		{

				for (int j = (i+1) ; j < array.length  ; j++)
				{
						if (array[j] == array[i])		
						{
							dbl = dbl +1;
						}
				}

		}
		System.out.println(dbl);
	}
}

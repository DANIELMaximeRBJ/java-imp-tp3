
public class TestArray1 {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		System.out.println("Ordre normal");
		for (int i = 0; i < array.length ; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("Ordre inverse");
		for (int i = array.length -1; i >= 0 ; i--)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("Entiers superieur à trois");
		for (int i = 0; i < array.length ; i++)
		{
			if (array[i]>3)
			{
				System.out.println(array[i]);
			}
		}
		
		System.out.println("Entiers pairs");
		for (int i = 0; i < array.length ; i++)
		{
			if (array[i]%2 == 0 )
			{
				System.out.println(array[i]);
			}
		}
		
		int val= 0 ;
		
		System.out.println("Entier le plus grand");
		for (int i = 0; i < array.length-1 ; i++)
		{
				if ((array[i] > array[i+1]) && (val < array[i]))
				{				
					 val = array[i];
				}
				if (array[array.length-1] > val) 
				{				
					 val = array[array.length-1];
				}
		}
		System.out.println(val);
		
		System.out.println("Entier le plus petit");
		for (int i = 0; i < array.length-1 ; i++)
		{
				if ((array[i] < array[i+1]) && (val > array[i]))
				{				
					 val = array[i];
				}
				if (array[array.length-1] < val) 
				{				
					 val = array[array.length-1];
				}
		}
		System.out.println(val);
		
	
	}	
}

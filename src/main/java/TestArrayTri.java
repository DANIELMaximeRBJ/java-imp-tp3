
import java.util.Arrays;

public class TestArrayTri {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		System.out.println("Ordre ascendant");
		int val;
		
		int[] arrayTrier = array;
		for (int i = 0; i < arrayTrier.length ; i++){
			for (int j = i+1; j < arrayTrier.length ; j++){
				if (arrayTrier[i]>arrayTrier[j]){
					val = arrayTrier[i];
					arrayTrier[i]=arrayTrier[j];
					arrayTrier[j]=val;
				}
			}
		}
		
		for (int i = 0; i < arrayTrier.length ; i++)
		{
			System.out.println(arrayTrier[i]);
		}
		Arrays.sort(array);
		System.out.println("\nTri avec arrays");
		
		for (int i = 0; i < array.length ; i++)
		{
			System.out.println(array[i]);
		}
	}	
}

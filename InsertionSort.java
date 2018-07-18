package sorting;

/*
 * works by inserting the element in the right place.
 * 
 * No.of Swaps < No.of Comparisions.
 */
public class InsertionSort {
	
	public static void play() {

		System.out.println("\nInsertion Sort -> ");
		
		int array[] = { 7, 1, 9, 0, 3 };
		sort(array);
	}

	private static void sort(int array[]) {

		for (int i = 0; i < (array.length-1); i++) {
			int k = i;
			for (int j = i+1; j < (array.length); j++) {
				if (array[k] >= array[j] ) {
					k = j;
				}				
			}
			int temp = array[i];
			array[i] = array[k];
			array[k] = temp;
			
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

}

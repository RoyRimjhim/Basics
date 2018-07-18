package sorting;

/*
 * works by repeatedly swapping the adjacent elements if they are in wrong order.
 * No.of Swaps = No.of Comparisions.
 */
public class BubbleSort {

	public static void play() {

		System.out.println("Bubble Sort -> ");
		
		int array[] = { 1, 7, 9, 0, 3 };
		sort(array);
	}

	private static void sort(int array[]) {

		for (int i = 0; i < (array.length - 1); i++) {
			for (int j = 0; j < (array.length - 1 - i); j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}

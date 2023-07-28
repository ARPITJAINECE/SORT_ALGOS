package quickSort;

import static quickSort.QuickSort.QuickSort;

public class TesterQuickSort {

	public static void main(String[] args) {
		int arr[] = { 15, 20, 5, 8, 95, 12, 80, 17, 9, 55 };
		QuickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

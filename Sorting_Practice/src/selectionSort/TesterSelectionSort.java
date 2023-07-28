package selectionSort;

import static selectionSort.SelectionSort.SelectionSort;

public class TesterSelectionSort {

	public static void main(String[] args) {
		int[] arr = { 25, 30, 12, 18, 40, 25, 15, 30, -10 };
		SelectionSort(arr);
		for (int val : arr) {
			System.out.println(val);
		}
	}
}

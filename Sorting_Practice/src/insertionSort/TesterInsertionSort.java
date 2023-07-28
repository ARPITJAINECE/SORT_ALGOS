package insertionSort;

import static insertionSort.InsertionSort.InsertionSort;

public class TesterInsertionSort {

	public static void main(String[] args) {
		int arr[] = { 20, 9, 15, 18, 12 };
		InsertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("desc order");
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}

package heapSort;

import static heapSort.HeapSort.HeapSort;

public class TesterHeapSort {

	public static void main(String[] args) {
		int[] arr = { 60, 10, 12, 9, 9, 20, 25, 50 };
		HeapSort(arr, arr.length);
		for (int val : arr) {
			System.out.println(val);
		}
	}

}

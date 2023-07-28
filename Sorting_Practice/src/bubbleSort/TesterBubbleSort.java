package bubbleSort;

import static bubbleSort.BubbleSort.BubbleSort;

public class TesterBubbleSort {

	public static void main(String[] args) {
		int[] arr = { 25, 30, 12, 18, 40, 25, 15, 30, -10 };
		BubbleSort(arr);
		for (int val : arr) {
			System.out.println(val);
		}
	}

}

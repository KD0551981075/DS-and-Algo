package array;

import java.util.Arrays;

public class NegativeAndPositive {
	public static void main(String args[]) {
		int[] unsorted = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		
		System.out.println(Arrays.toString(bubbelSort(unsorted)));
	}

	private static int[] bubbelSort(int[] unsorted) {

		for (int j = 0; j < unsorted.length - 1; j++) {
			boolean flag = false;
			for (int i = 0; i < unsorted.length - 1; i++) {
				if (unsorted[i] > unsorted[i + 1]) {
					int temp = unsorted[i];
					unsorted[i] = unsorted[i + 1];
					unsorted[i + 1] = temp;
					flag = true;
				}
				if(!flag)
					break;
			}
		}
		return unsorted;
	}

}

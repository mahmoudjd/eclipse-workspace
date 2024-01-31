package sort;

public class TestSort {

	public static int[] selectionSort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int minPos = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[minPos]) {
					minPos = j;
				}
			}

			int t = a[i];
			a[i] = a[minPos];
			a[minPos] = t;
		}

		return a;
	}

	public static int[] bubbleSort(int[] a) {
		for (int i = a.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		return a;
	}

	public static int[] insertionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		return a;
	}

	public static int[] merge(int[] left, int[] right) {
		int[] merged = new int[left.length + right.length];
		int li = 0, ri = 0, mi = 0;

		while (li < left.length && ri < right.length) {
			if (left[li] <= right[ri]) {
				merged[mi] = left[li];
				li++;
			} else {
				merged[mi] = right[ri];

				ri++;
			}
			mi++;
		}

		while (li < left.length) {
			merged[mi] = left[li];
			li++;
			mi++;
		}
		while (ri < right.length) {
			merged[mi] = right[ri];
			mi++;
			ri++;
		}
		return merged;
	}

	public static int[] mergeSort(int[] a) {

		if (a.length <= 1) {
			return a;
		}

		int m = a.length / 2;

		int[] left = new int[m];
		for (int i = 0; i < m; i++) {
			left[i] = a[i];
		}
		int[] right = new int[a.length - m];
		for (int i = 0; i < right.length; i++) {
			right[i] = a[i + m];
		}

		left = mergeSort(left);
		right = mergeSort(right);

		return merge(left, right);
	}

	public static int findMode(int[] a) {
		int maxCount = 0;
		int mode = a[0];
		if (a.length < 1) {
			return 0;
		}
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}

			if (count > maxCount) {
				maxCount = count;
				mode = a[i];
			}
		}
		System.out.println("Mode is " + mode);

		return maxCount;
	}

	public static int findMode2(int[] a) {
		a = mergeSort(a);
		int maxCount = 1;
		int mode = a[0];
		int currentCount = 1;
		if (a.length < 1) {
			return 0;
		}
		for (int i = 1; i < a.length; i++) {
			if (a[i] == a[i - 1]) {
				currentCount++;
			} else {
				currentCount = 1;
			}

			if (currentCount > maxCount) {
				maxCount = currentCount;
				mode = a[i];
			}
		}
		System.out.println("Mode is " + mode);

		return maxCount;
	}

	public static void main(String[] args) {
		int[] a = { 0, 5, 4, 2, 2, 2, 3, 1, 6, 6, 6, 6, 8, 7, 9 };
		int[] sortedA1 = selectionSort(a);
		int[] sortedA2 = bubbleSort(a);
		int[] sortedA3 = insertionSort(a);
		int[] sortedA4 = mergeSort(a);
		System.out.println("selection sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(sortedA1[i] + " ");
		}
		System.out.println("\n---------");
		System.out.println("bubble sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(sortedA2[i] + " ");
		}
		System.out.println("\n---------");
		System.out.println("insertion sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(sortedA3[i] + " ");
		}
		System.out.println("\n---------");
		System.out.println("merge sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(sortedA4[i] + " ");
		}

		System.out.println("\n---------");
		System.out.println("FindMode is " + findMode(a));
		System.out.println("FindMode2 is " + findMode2(a));
	}
}

package quickSorting;

class QuickSort {

	static void sort(int[] array) {

		int p = 0;
		int r = array.length - 1;

		quickSort(array, p, r);
	}

	private static int partition(int[] array, int p, int r) {

		int x = array[r];
		int i = p - 1;

		for (int j = p; j < r; j++) {

			if (array[j] <= x) {

				i = i + 1;
				swap(array, i, j);
			}
		}

		swap(array, i + 1, r);

		return i + 1;
	}

	private static void swap(int[] array, int i, int j) {

		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	private static void quickSort(int[] array, int p, int r) {

		int q;

		if (p < r) {

			q = partition(array, p, r);
			quickSort(array, p, q - 1);
			quickSort(array, q + 1, r);
		}
	}

}

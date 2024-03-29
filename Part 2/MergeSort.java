public class MergeSort {
	void merge(double arr[], int left, int mid, int right, int order) {
		// Find sizes of two sub arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		/* Create temporary arrays */
		double leftArray[] = new double[n1];
		double rightArray[] = new double[n2];

		/* Copy data to temporary arrays */
		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		/* Merge the temporary arrays */

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = left;
		while (i < n1 && j < n2) {
			if (order == 1)
			{	
				if (leftArray[i] <= rightArray[j]) {
					arr[k] = leftArray[i];
					i++;
				} else {
					arr[k] = rightArray[j];
					j++;
				}
				k++;
			}
			else
			{	
				if (leftArray[i] >= rightArray[j]) {
					arr[k] = leftArray[i];
					i++;
				} else {
					arr[k] = rightArray[j];
					j++;
				}
				k++;
			}
		}


		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	// Main function that sorts array[left...right] using merge()
	public void sort(double[] notes, int left, int right, int order) {
		if (left < right) {
			// Find the middle point
			int mid = (left + right) / 2;

			// Sort first and second halves
			sort(notes, left, mid, order);
			sort(notes, mid + 1, right, order);

			// Merge the sorted halves
			merge(notes, left, mid, right, order);
		}
	}
}
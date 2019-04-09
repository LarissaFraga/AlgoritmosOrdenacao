package quickSort;

public class QuickSort {

	public void quicksort(String a[], int init, int end) {
		int i = partition(a, init, end);

		if (init < i - 1)
			quicksort(a, init, i - 1);

		if (i < end)
			quicksort(a, i, end);
	}

	public int partition(String a[], int init, int end) {

		int i = init;
		int j = end;

		String pivot = a[(init + end) / 2];

		while (i <= j) {

			while (a[i].compareTo(pivot) < 0) {
				i++;
			}

			while (a[j].compareTo(pivot) > 0) {
				j--;
			}

			if (i <= j) {
				String aux = a[i];
				a[i++] = a[j];
				a[j--] = aux;
			}
		}

		return i;
	}

	public static void main(String[] args) {

		QuickSort b = new QuickSort();

		String vet[] = { "riacho", "uva", "corredor" };

		b.quicksort(vet, 0, vet.length - 1);

		for (int i = 0; i < vet.length; i++) {
			System.out.printf("[" + vet[i] + "]");
		}
	}

}
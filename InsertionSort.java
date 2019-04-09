package insertionSort;

public class InsertionSort {

	public void insertionSort(String a[]) {
		String aux = null;
		for (int i = 1; i < a.length; i++) {
			int j = i;
			while (j > 0 && a[j - 1].compareTo(a[j]) > 0) {
				aux = a[j];
				a[j] = a[j - 1];
				a[j - 1] = aux;
				j -= 1;
			}
		}
	}

	public static void main(String[] args) {
		InsertionSort a = new InsertionSort();

		String vet[] = { "riacho", "uva", "corredor" };

		a.insertionSort(vet);

		for (int i = 0; i < vet.length; i++) {
			System.out.printf("[" + vet[i] + "]");
		}
	}
}
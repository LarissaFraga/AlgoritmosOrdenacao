package bubbleSort;

public class BubbleSort {

	public void bubblesort(String a[]) {
		String aux = null;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}
			}

		}
	}

	public static void main(String[] args) {

		BubbleSort b = new BubbleSort();

		String a[] = { "riacho", "uva", "corredor" };

		b.bubblesort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.printf("[" + a[i] + "]");
		}
	}
}
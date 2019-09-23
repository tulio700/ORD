import java.io.IOException;


public class Insertion {

	public static void main(String[] args) throws IOException {
		int vetor [] = {20, 5, 6, 9, 25, 1, 2, 36, 100, 5, 9, 125, 7, 3, 4, 0, 23, 8, 10, 11};
		Insertion is = new Insertion();
		is.insertionSort(vetor);
		for (int x = 0, y = vetor.length; x < y; x++) {
            System.out.print(vetor[x] + " ");
        }
	}

	private void insertionSort(int[] vetor) {
		int j, key, i, length = vetor.length;
		for (j = 1; j < length; j++) {
			key = vetor[j];
			for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
				vetor[i + 1] = vetor[i];
				
                for (int k = 0; k < length; k++) {
                    System.out.print(vetor[k] + " ");
                }
                System.out.println(" ");
			}
			vetor[i + 1] = key;
		}
	}
}
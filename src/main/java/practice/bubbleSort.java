package practice;

public class bubbleSort {
    public static void main(String[] args) {

        int array[] = {4, 2, 12, 0};
        readArray(array);
        bubbleSort(array);
        readArray(array);

    }

    public static void bubbleSort(int[] a) {
        int auxVariable = 0;
        int count;

        do {
            count = 0;
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] > a[i + 1]) {
                    auxVariable = a[i];
                    a[i] = a[i + 1];
                    a[i+1] = auxVariable;
                    count++;
                }
            }
        } while (count > 0);
    }

    public static void readArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "");
        }
    }
}

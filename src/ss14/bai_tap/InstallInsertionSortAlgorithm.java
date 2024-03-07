package ss14.bai_tap;

import java.util.Arrays;

public class InstallInsertionSortAlgorithm {
    public int[] insertionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            int y = i;
            while (y > 0 && x < array[y - 1]) {
                array[y] = array[y - 1];
                y--;
            }
            array[y] = x;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 1, 2, 6, 7, 995, 6, 54, 5, 23, 6, 11, 55};
        InstallInsertionSortAlgorithm installInsertionSortAlgorithm = new InstallInsertionSortAlgorithm();
        installInsertionSortAlgorithm.insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}

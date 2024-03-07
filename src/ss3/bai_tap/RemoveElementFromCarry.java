package ss3.bai_tap;


import java.sql.Array;
import java.util.Arrays;

public class RemoveElementFromCarry {
    public static void main(String[] arge) {
        int array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int variable = 4;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == variable) {
                for (int j = i; j < array1.length - 1; j++) {
                    array1[j] = array1[j + 1];
                }
                array1[array1.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(array1));

    }
}

package ss3.bai_tap;

import java.util.Arrays;

public class LargestNumberOfArray {
    public static void main(String[] arge) {
        int array[][] = {{9,5},{300,2},{8,98},{100,200}};
        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất có trong mảng là : " + max);
    }
}

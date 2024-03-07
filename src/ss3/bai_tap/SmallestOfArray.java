package ss3.bai_tap;

import java.util.Arrays;

public class SmallestOfArray {
    public static void main(String[] arge) {
        int array1[] = {9, 2, 588, 1, 4, 6, 10, 2, 5, 4};
        int min;
        min = array1[0];
        System.out.println("Các phần tử có trong mảng : " + Arrays.toString(array1));
        for (int i = 0; i < array1.length; i++) {
            if (min > array1[i]) {
                min = array1[i];

            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là : " + min);
    }

}

package ss14.bai_tap;

import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int array[] = {8, 9, 6, 3, 8, 1, 4, 6, 7, 16};
        //cho một mảng array có sẵn;
        //chạy vòng for từ vị trí thứ 1 đến cuối mảng;
        for (int i = 1; i < array.length; i++) {
            //gán biến x = aray vị trí thứ i đó;
            int x = array[i];
            // khai báo một biến index và gán biến index = i của vòng for
            // ;
            int y = i;
            //điều kiện : index phải < 0 và  x < array[index - 1];
            while (y > 0 && x < array[y - 1]) {
                //nếu thoản mãn hai điều kiện trê thì :
                // biến thứ array[index] = array[array - 1];
                array[y] = array[y - 1];
                //và index sẽ bị trừ đi 1 đơn vị;
                y--;
            }
            //và gán giá trị array[index] = với giá trị hiện tại của x;
            array[y] = x;
            //Các vòng chạy kết quả sẽ là;
            System.out.println(Arrays.toString(array));
        }
        // System.out.println("Các phần tử trong mảng đã được sắp xếp : "+Arrays.toString(array));
    }

}

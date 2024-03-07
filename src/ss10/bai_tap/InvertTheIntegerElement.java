package ss10.bai_tap;

import java.util.Arrays;
import java.util.Stack;


public class InvertTheIntegerElement {
    public void invertInteger() {
        //Đảo ngược phần tử trong mảng số nguyên.
        Stack<Integer> integerStack = new Stack<>();
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (Integer i : array) {
            integerStack.push(i);
        }
        for (int i = 0; i < 7; i++) {
            array[i] = integerStack.pop();
        }
        System.out.println(Arrays.toString(array));
    }

    public void reverseString() {
        //Đảo ngược chuỗi.
        Stack<String> wStack = new Stack<>();
        String mWord = "dinhthanhhai";
        String[] array1 = mWord.split("");
        for (int i = 0; i < array1.length; i++) {
            wStack.push(array1[i]);
        }
        for (int i = 0; i < array1.length; i++) {
            array1[i] = wStack.pop();
        }
        System.out.println(Arrays.toString(array1));
    }

    public static void main(String[] args) {
        InvertTheIntegerElement invertTheIntegerElement = new InvertTheIntegerElement();
        invertTheIntegerElement.invertInteger();
        invertTheIntegerElement.reverseString();
    }

}


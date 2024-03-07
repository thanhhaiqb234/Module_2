package ss2.bai_tap;

import java.util.Scanner;

public class CountOccurrencesOfSign {
    public static void main(String[] args) {
        char character;
        int count = 0;
        String string = "aaaabbbbcccc";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự mà bạn muốn kiểm tra vào ");
        character=scanner.next().charAt(0);
        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)){
                count++;
            }
        }
        System.out.println("kí tự "+character +" xuất hiện "+count +" lần");
    }
}

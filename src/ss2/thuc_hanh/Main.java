package ss2.thuc_hanh;

import java.util.Scanner;

public class Main {
   public static void main(String[] arge){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Nhập số nguyên tố mà bạn muốn kiểm tra vào");
       int number = scanner.nextInt();
       boolean flag = true;
       if (number < 2){
           System.out.println("Số này không phải là số nguyên tố");
       }else {
           if (number == 2 ){
               System.out.println("Số này là số nguyên tố");
           }else {
               for (int i = 2; i < number; i++) {
                   if (number % i == 0){
                       flag = false;
                       break;
                   }
               }if (flag){
                   System.out.println("Số này là số nguyên số");
               }else {
                   System.out.println("Số này không phải là số nguyên tố");
               }
           }
       }
   }
}

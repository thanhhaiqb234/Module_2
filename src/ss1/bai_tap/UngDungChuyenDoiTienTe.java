package ss1.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD mà bạn cần đổi vào : ");
        int nhap = Integer.parseInt(scanner.nextLine());
        final double tienGoc = 0.00043;
        long tong = 0;
        if (nhap > 0) {
            tong += nhap * tienGoc;
            System.out.println("Tổng tiền bạn muốn đổi = " + tong + " USD ");
        }else {
            System.out.println("Số tiền bạn nhập quá nhỏ không thể đổi được. Xin vui lòng nhập lại");
        }
    }
}

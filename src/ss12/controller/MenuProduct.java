package ss12.controller;

import ss12.repository.ProductRepository;
import ss12.service.ProductService;

import java.util.Scanner;

public class MenuProduct {
    Scanner scanner = new Scanner(System.in);
   private ProductService productService = new ProductService();

    public void displayMenu() {
        boolean flag = true;
        do {
            System.out.println("-----Chương trình quản lý nông sản sạch-----");
            System.out.println("Chọn chức năng theo số (để tiếp tục )\n" +
                    "1 : Thêm sản phẩm\n" +
                    "2 : Sửa thông tin sản phẩm (theo ID)\n" +
                    "3 : Xóa Sản phẩm (theo ID)\n" +
                    "4 : Hiển thị danh sách sản phẩm (đang bán trong cửa hàng\n" +
                    "5 : Tìm kiếm sản phẩm theo tên\n" +
                    "6 : Sắp xếp sản phẩm tăng dầnn theo giá.)\n" +
                    "7 : Sắp sếp sản phẩm giảm dần theo giá ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    productService.addProduct();
                    break;
                case "2":
                    break;
                case "3":
                    productService.deleteProduct();
                    break;
                case "4":
                    productService.display();
                    break;
                case "5":
                    productService.searchProduct();
                    break;
                case "6":
                    productService.sortProduct();
                    break;
                case "7":
                    productService.sortDownProduct();
                    break;
                case "8":
                default:
                    System.out.println("Bạn Đã chọn sai rồi xin phép chọn lại : ");
                    flag = false;

            }
        } while (flag);
    }
}

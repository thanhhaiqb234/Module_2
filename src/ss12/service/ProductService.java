package ss12.service;

import ss12.model.Product;
import ss12.repository.ProductRepository;

import java.util.*;

public class ProductService implements IProductService{
    Scanner scanner = new Scanner(System.in);
   private ProductRepository productRepository = new ProductRepository();

    @Override
    public void display() {
        List<Product> productList = productRepository.getProductList();
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void addProduct() {
        System.out.println("Nhập mã sản phẩm : ");
        String idProduct = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm : ");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm : ");
        int priceProduct = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập NSX và HSD : ");
        String expiryProduct = scanner.nextLine();
        System.out.println("Mô tả về sản phẩm : ");
        String describeProduct = scanner.nextLine();
        Product product = new Product(idProduct,nameProduct,priceProduct,expiryProduct,describeProduct);
        productRepository.addProduct(product);
        System.out.println("Bạn đã thêm thành công ");
    }

    @Override
    public void deleteProduct() {
        System.out.println("Nhập mã sản phẩm cần xóa : ");
        String idProduct = scanner.nextLine();
        boolean checkDelete = productRepository.deteleProduct(idProduct);
        if (checkDelete){
            System.out.println("Bạn đã xóa thành công ");
        }else {
            System.out.println("Không tìm thấy sản phẩm mà bạn cần xóa ");
        }
    }

    @Override
    public void searchProduct() {
        List<Product> productList = productRepository.getProductList();
        System.out.println("Nhập tên sản phẩm bạn cần tìm kiếm : ");
        String nameProduct = scanner.nextLine();
        List<Product> productList1= productRepository.searchProduct(nameProduct);
        for (Product product : productList1) {
            System.out.println(product);
        }
    }

    @Override
    public void sortProduct() {
        List<Product> productList = productRepository.getProductList();
        for (int i = 0; i < productList.size(); i++) {
            Collections.sort(productList, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return o1.getPriceProduct()-o2.getPriceProduct();
                }
            });
        }
    }

    @Override
    public void sortDownProduct() {
        List<Product> productList = productRepository.getProductList();
        for (int i = 0; i < productList.size(); i++) {
            Collections.sort(productList, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return o2.getPriceProduct()-o1.getPriceProduct();
                }
            });
        }
    }


}

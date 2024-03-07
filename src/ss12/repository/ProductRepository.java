package ss12.repository;

import ss12.model.Product;
import ss12.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();
    //public Product(String idProduct, String nameProduct, int priceProduct, String expiryProduct, String describeProduct)
    static {
       productList.add(new Product("SP-001","Rau Cải cay Đà Lạt",20000,"30/04-02/05","Cải cay không có thuốc trừ sâu siêu sạch"));
       productList.add(new Product("SP-002","Su hào Lào cai",15000,"01/05-20/05","Su hào không có thuốc trừ sâu siêu sạch"));
       productList.add(new Product("SP-003","Súp lơ Quảng Trị",40000,"21/05-25/05","Súp lơ không có thuốc trừ sâu siêu sạch"));
    }


    @Override
    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public boolean deteleProduct(String idProduct) {
        for (int i = 0; i < productList.size(); i++) {
            if (idProduct.equals(productList.get(i).getIdProduct())){
                productList.remove(i);
                return  true;
            }
        }
        return false;
    }

    @Override
    public List<Product> searchProduct(String nameProduct) {
        List<Product> productList1 = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getNameProduct().contains(nameProduct)){
                productList1.add(productList.get(i));
            }
        }
        return productList1;
    }

    @Override
    public int sortUpProduct(Product p1, Product p2) {
        return p1.getPriceProduct()-p2.getPriceProduct();
    }

    @Override
    public int sortDowrProduct(Product p1, Product p2) {
        return p2.getPriceProduct()-p1.getPriceProduct();
    }


}

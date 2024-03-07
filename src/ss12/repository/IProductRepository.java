package ss12.repository;

import ss12.model.Product;
import ss12.service.ProductService;

import java.util.List;

public interface IProductRepository {
    List<Product> getProductList();
    void addProduct(Product product);
    boolean deteleProduct(String idProduct);
    List<Product> searchProduct(String nameProduct);
    int sortUpProduct(Product p1,Product p2);
    int sortDowrProduct(Product p1,Product p2);

}

package ss12.model;

public class Product {
    private String idProduct;
    private String nameProduct;
    private int priceProduct;
    private String expiryProduct;
    private String describeProduct;

    public Product() {
    }

    public Product(String idProduct, String nameProduct, int priceProduct, String expiryProduct, String describeProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.expiryProduct = expiryProduct;
        this.describeProduct = describeProduct;
    }


    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getExpiryProduct() {
        return expiryProduct;
    }

    public void setExpiryProduct(String expiryProduct) {
        this.expiryProduct = expiryProduct;
    }

    public String getDescribeProduct() {
        return describeProduct;
    }

    public void setDescribeProduct(String describeProduct) {
        this.describeProduct = describeProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Mã sản phẩm ='" + idProduct + '\'' +
                ", Tên Sản phẩm ='" + nameProduct + '\'' +
                ", Giá của sản phẩm =" + priceProduct +
                ", NSX-HSD ='" + expiryProduct + '\'' +
                ", Mô tả sản phẩm ='" + describeProduct + '\'' +
                '}';
    }
}

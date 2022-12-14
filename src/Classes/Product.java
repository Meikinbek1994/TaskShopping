package Classes;

import Enums.ProductTypes;

public class Product {
    private ProductTypes productTypes;
    private double price;
    private double discount;

    public Product(ProductTypes productTypes, double price, double discount) {
        this.productTypes = productTypes;
        this.price = price;
        this.discount = discount;
    }

    public ProductTypes getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(ProductTypes productTypes) {
        this.productTypes = productTypes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double getPriceWithDiscount(){
        return (price-price*discount/100);
    }
}

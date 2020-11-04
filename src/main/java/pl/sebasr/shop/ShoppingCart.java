package pl.sebasr.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingCart {

    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public ShoppingCart() {

        productList = new ArrayList<>();

        productList.add(new Product("Motocykl Yamaha", 25000));
        productList.add(new Product("Motocykl BMW", 35000));
        productList.add(new Product("Motocykl Kawasaki", 22000));
        productList.add(new Product("Kask Shoei", 2500));
        productList.add(new Product("Kask HJC", 2000));
        productList.add(new Product("Kask Shark", 1500));
        productList.add(new Product("Wyposażenie BASIC", 0));
        productList.add(new Product("Wyposażenie Premium", 5000));
        productList.add(new Product("Wyposażenie Adventure", 7000));




        this.productList = productList;
    }

}

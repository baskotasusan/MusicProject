package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sushan on 7/8/2017.
 */
public class ProductDao {
    List<Product> productList;

    public List<Product> getProductList(){
        Product product = new Product();
        product.setProductName("lenovo zuk z2");
        product.setProductCategory("mobile");
        product.setProductCondition("new");
        product.setProductDescription("lenovo zuk smartphone series");
        product.setProductManufacturer("lenovo");
        product.setProductPrice(250);
        product.setProductStatus("available");
        product.setUnitInStock(10);

        Product product1 = new Product();
        product1.setProductName("samsung note 8");
        product1.setProductCategory("mobile");
        product1.setProductCondition("new");
        product1.setProductDescription("samsung series");
        product1.setProductManufacturer("samsung");
        product1.setProductPrice(750);
        product1.setProductStatus("available");
        product1.setUnitInStock(30);

        Product product2 = new Product();
        product2.setProductName("iphone 7");
        product2.setProductCategory("mobile");
        product2.setProductCondition("new");
        product2.setProductDescription("iphone sereis");
        product2.setProductManufacturer("apple");
        product2.setProductPrice(850);
        product2.setProductStatus("available");
        product2.setUnitInStock(40);

        productList = new ArrayList<Product>();
        productList.add(product);
        productList.add(product1);
        productList.add(product2);

        return productList;
    }
}

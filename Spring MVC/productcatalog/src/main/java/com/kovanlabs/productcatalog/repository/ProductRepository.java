package com.kovanlabs.productcatalog.repository;

import com.kovanlabs.productcatalog.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> productList = new ArrayList<>();

    int num = 1;

    public List<Product> findAll() {
        return productList;
    }

    public void save(Product product){
        product.setProductId(num++);
        productList.add(product);
    }

    public void delete(int productId){
        productList.removeIf(p -> p.getProductId() == productId);
    }
}
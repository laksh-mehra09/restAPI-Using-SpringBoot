package com.laksh.springRest.Services;

import com.laksh.springRest.Product.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Headphone", 1500),
            new Product(102, "Laptop", 80000)
    ));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProduct(int id){

        for(Product p : products){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public Product addProduct(Product p){
        products.add(p);
        return p;
    }

    public void updateProduct(Product p){

        int index = 0;
        for(int i=0; i<products.size(); i++)
            if(products.get(i).getId() == p.getId())
                index = i;

        products.set(index, p);
    }

    public void deleteProduct(int id){

        int index = 0;
        for(int i=0; i<products.size(); i++)
            if(products.get(i).getId() == id)
                index = i;

        products.remove(index);
    }
}
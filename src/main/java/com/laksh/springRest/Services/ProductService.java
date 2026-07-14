package com.laksh.springRest.Services;

import com.laksh.springRest.Product.Product;
import com.laksh.springRest.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProduct(int id){
        return repo.findById(id).get();
    }

    public Product addProduct(Product p){
        return repo.save(p);
    }

    public Product updateProduct(Product p){
        return repo.save(p);
    }

    public void deleteProduct(int id){
        repo.deleteById(id);
    }
}
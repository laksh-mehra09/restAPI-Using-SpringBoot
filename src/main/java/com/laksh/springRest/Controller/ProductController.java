package com.laksh.springRest.Controller;

import com.laksh.springRest.Product.Product;
import com.laksh.springRest.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id){
        return service.getProduct(id);
    }

    @PostMapping("/product/add")
    public Product addProduct(@RequestBody Product p){
        return service.addProduct(p);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product p){

        service.updateProduct(p);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
        System.out.println("Product deleted successfully...");
    }
}

package com.kovanlabs.productcatalog.controller;

import com.kovanlabs.productcatalog.model.Product;
import com.kovanlabs.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String getAllProducts(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "product-list";
    }

    @GetMapping("/create")
    public String showCreatePage(){
        return "product-form";
    }

    @PostMapping("/create")
    public String createProduct(Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/delete")
    public String showDeletePage(){
        return "product-delete";
    }

    @PostMapping("/delete")
    public String deleteProduct(@RequestParam int productId){
        productService.deleteproduct(productId);
        return "redirect:/products";
    }
}
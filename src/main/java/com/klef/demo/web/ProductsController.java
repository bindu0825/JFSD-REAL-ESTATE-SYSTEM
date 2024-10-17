package com.klef.demo.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductsController {

    @GetMapping("/Products")
    public String showProductsPage() {
        return "Products"; // Assuming "Cart.html" is in your templates directory
    }
}

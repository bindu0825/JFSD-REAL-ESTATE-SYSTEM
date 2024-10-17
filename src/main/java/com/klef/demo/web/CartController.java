package com.klef.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

    @GetMapping("/Cart")
    public String showCartPage() {
        return "Cart"; // Assuming "Cart.html" is in your templates directory
    }
}
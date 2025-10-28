package jsp.shopease.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jsp.shopease.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String listProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "product"; // returns product.html
    }

    @GetMapping("/product/{id}")
    public String getProductById(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.getById(id));
        return "product-details"; // returns product-details.html
    }
}

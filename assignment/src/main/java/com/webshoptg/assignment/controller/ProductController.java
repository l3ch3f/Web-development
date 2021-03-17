package com.webshoptg.assignment.controller;

import com.webshoptg.assignment.model.product.ProductInfo;
import com.webshoptg.assignment.model.product.ProductSpecification;
import com.webshoptg.assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/{id}")
    public String viewProductDetailsPage(@PathVariable("id")Long id, Model model){
        Optional<ProductInfo> product = service.findById(id);
        ProductSpecification specs = product.get().getProductSpecification();
        model.addAttribute("product", product.get());
        model.addAttribute("specs", specs);
        return "product";
    }

}

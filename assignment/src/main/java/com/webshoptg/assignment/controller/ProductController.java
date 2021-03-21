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

import java.nio.charset.Charset;
import java.util.Optional;
import java.util.Random;

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

        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        model.addAttribute("new_token",generatedString);
        return "product";
    }

}

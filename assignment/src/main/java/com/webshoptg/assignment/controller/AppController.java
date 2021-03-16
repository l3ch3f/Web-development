package com.webshoptg.assignment.controller;

import com.webshoptg.assignment.model.product.ProductInfo;
import com.webshoptg.assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private ProductService service;
    
    @GetMapping("")
    public String viewIndexPage(Model model){
        List<ProductInfo> listProducts = service.findAll();
        model.addAttribute("listProducts", listProducts);
        return "landing";
    }
}

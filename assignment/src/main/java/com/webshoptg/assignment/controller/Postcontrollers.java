package com.webshoptg.assignment.controller;

import com.webshoptg.assignment.model.dto.ProductDtoCart;
import com.webshoptg.assignment.model.product.ProductInfo;
import com.webshoptg.assignment.model.user.ShoppingCart;
import com.webshoptg.assignment.repository.ShoppingCartRepository;
import com.webshoptg.assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Controller
public class Postcontrollers {
    @Autowired
    private ProductService service;
    @Autowired
    ShoppingCartRepository repo;

    @PostMapping("/addCart")
    public ResponseEntity addCart(@RequestBody ProductDtoCart request) {
        Optional<ProductInfo> product = (service.findById(request.getProductId()));
        System.out.println(product.get());
        ShoppingCart cartExist = repo.findByToken(request.getToken());
        if (cartExist==null){
            ShoppingCart cart = new ShoppingCart();
            cart.setToken(request.getToken());
            repo.save(cart);
            return new ResponseEntity("added to cart +++ token has been created", HttpStatus.OK);
        } else {
            System.out.println(request.getToken());
            //TODO Token moet anders gemaakt worden.
            System.out.println(cartExist.getToken().contains(request.getToken()));
            return new ResponseEntity("added to cart without token create", HttpStatus.OK);
        }
//        return new ResponseEntity("Something WONG?!?!", HttpStatus.INTERNAL_SERVER_ERROR);

    }
}

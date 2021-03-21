package com.webshoptg.assignment.controller;

import com.webshoptg.assignment.model.product.ProductInfo;
import com.webshoptg.assignment.model.user.UserLog;
import com.webshoptg.assignment.repository.TokenRepository;
import com.webshoptg.assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Random;

// Genereer een token en store in localstorage door web cart.
// Store dit ook in de Database voor session management met id/
// Wanneer je product toevoegt aan shoppingcart dat is een post form generated value vanaf front end doormiddel van cookie of localstorage token.
// Bij de Product page controleer in de DB of er een token in staat zo niet Genereer er 1. en store die en geef die dan weer door aan Front end
// nog een button om naar de cart te gaan en dat is generated get request door de token
// shopping cart haalt de form request op basis van generated value token of id.



@Controller
public class AppController {
    @Autowired
    private ProductService service;
    @Autowired
    private TokenRepository token;

    @GetMapping("")
    public String viewIndexPage(Model model){
        List<ProductInfo> listProducts = service.findAll();
        model.addAttribute("listProducts", listProducts);
        UserLog log = new UserLog();
        //Random string gen:
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        log.setUserToken(generatedString);
        token.save(log);
        model.addAttribute("token",generatedString);
        return "landing";
    }
}

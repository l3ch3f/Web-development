package com.webshoptg.assignment.config;

import com.webshoptg.assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Collections;

@Configuration

public class WebSecurityConfig {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private ProductService productService;

}

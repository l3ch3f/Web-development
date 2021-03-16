package com.webshoptg.assignment.repository;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.webshoptg.assignment.model.product.ProductInfo;
import com.webshoptg.assignment.model.product.ProductSpecification;
import com.webshoptg.assignment.model.product.StockList;
import com.webshoptg.assignment.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class ProductRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private ProductRepository repo;

    @Test
    public void testCreateProduct(){
        ProductInfo productInfo = new ProductInfo();
        ProductSpecification specs = new ProductSpecification();
        StockList stock = new StockList();
        productInfo.setProductName("Acer Aspire 5 A515-44-R0F5 - Laptop - 15.6 Inch");
        productInfo.setProducer("Acer");
        productInfo.setProductSpecification(specs);
        productInfo.setStockList(stock);
        productInfo.setPrice("679");
        productInfo.setImgUrl("https://media.s-bol.com/6B6w0L9ngVE7/124x89.jpg");
        stock.setStockQuantity(12);
        ProductInfo savedProduct = repo.save(productInfo);
        ProductInfo existProduct = entityManager.find(ProductInfo.class, savedProduct.getId());
        assertThat(productInfo.getProductName()).isEqualTo(existProduct.getProductName());
    }
}
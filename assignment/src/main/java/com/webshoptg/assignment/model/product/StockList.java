package com.webshoptg.assignment.model.product;

import javax.persistence.*;

@Entity
@Table(name = "stockList")
public class StockList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer stockQuantity;

    @OneToOne (cascade=CascadeType.ALL)
    private ProductInfo productInfo;


    // Constructors

    // Getters and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }
}

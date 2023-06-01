package com.example.ex01.domain;

import lombok.Data;

@Data
public class ProductVO {
    private Long productId;
    private String productName;
    private Long productStock;
    private String productPrice;
    private String registerDate;
    private String updateDate;

}

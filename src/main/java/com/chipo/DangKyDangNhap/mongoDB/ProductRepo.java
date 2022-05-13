package com.chipo.DangKyDangNhap.mongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepo  extends MongoRepository<Product, Long> {
    Product findProductById(Long id);

    Product findByTitle(String empNo);

    List<Product> findByImage(String img);

    List<Product> findByPriceBetween(float from, float to);

    // Supports native JSON query string
    @Query("{fullName:'?0'}")
    List<Product> findCustomByTitle(String title);
}

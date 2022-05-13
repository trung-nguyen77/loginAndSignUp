package com.chipo.DangKyDangNhap.mongoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping
public class ProductCtrl {

    @Autowired
    ProductRepo productRepo;

    @GetMapping("/showProduct")
    public String getProduct(@RequestParam Long id){
        Product product = productRepo.findProductById(id);
        return "showProduct";
    }

}

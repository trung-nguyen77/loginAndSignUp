package com.chipo.DangKyDangNhap;


import com.mongodb.DB;
import com.mongodb.MongoClient;
import org.springframework.stereotype.Component;

@Component
public class MongoConnection {
    public void getConnect(){
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB database = mongoClient.getDB("App_User");
        mongoClient.getDatabaseNames().forEach(System.out::println);
    }
}

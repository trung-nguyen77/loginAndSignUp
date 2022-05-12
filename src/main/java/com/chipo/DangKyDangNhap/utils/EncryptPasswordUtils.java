package com.chipo.DangKyDangNhap.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptPasswordUtils {
    // Mã hóa Password với BCryptPasswordEncoder
    public static String encrytePassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

    public static void main(String[] args) {
        String password = "123";
        String encryptPassword = encrytePassword(password);
        System.out.println("Encryted Password: " + encryptPassword);
    }
}

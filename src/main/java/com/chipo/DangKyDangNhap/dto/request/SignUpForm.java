package com.chipo.DangKyDangNhap.dto.request;

import java.util.Set;

public class SignUpForm {
    private String email;
    private String name;
    private String phone;
    private String password;
    private Set<String> roles;

    public SignUpForm() {
    }

    public SignUpForm(String email, String name, String phone, String password, Set<String> roles) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}

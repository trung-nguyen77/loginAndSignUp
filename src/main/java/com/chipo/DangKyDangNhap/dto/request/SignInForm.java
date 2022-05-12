package com.chipo.DangKyDangNhap.dto.request;

public class SignInForm {
    private String emailOrPhone;
    private String password;
    private String phone;

    public SignInForm() {
    }

    public SignInForm(String emailOrPhone, String password, String phone) {
        this.emailOrPhone = emailOrPhone;
        this.password = password;
        this.phone = phone;
    }

    public String getEmailOrPhone() {
        return emailOrPhone;
    }

    public void setEmailOrPhone(String emailOrPhone) {
        this.emailOrPhone = emailOrPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

package com.chipo.DangKyDangNhap.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;

public class ReadHTMLForm {
    public void getDocumentFromUrl() throws IOException {
        Document doc = Jsoup.parse(new File("userPage.ftl"), "utf-8");
        Element form = doc.getElementById("registerForm");
    }
}

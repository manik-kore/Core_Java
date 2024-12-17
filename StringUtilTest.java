package com.yash.corejava.url;

public class StringUtilTest {

    public static void main(String[] args) {

        StringUtil t = new StringUtil();

        String url = "www.google.com/admin/mycart.html";

        String result = t.getCommand(url);

        System.out.println(result);

    }
}

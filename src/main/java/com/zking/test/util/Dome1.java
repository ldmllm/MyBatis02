package com.zking.test.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Dome1 {
    public static void main(String[] args) {
        String path = "abc";
        ResourceBundle bundle = ResourceBundle.getBundle(path, Locale.US);
        String name = bundle.getString("name");
        System.out.println(name);
        String msg=bundle.getString("msg");
       msg=MessageFormat.format(msg, "zs", "ls");
        System.out.println(msg);

//        System.out.println(Locale.CHINA);
//        System.out.println(Locale.US);

    }
}

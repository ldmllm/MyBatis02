package com.zking.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;


import javax.servlet.http.HttpSession;
import java.util.Locale;


@Controller
@RequestMapping("/i18n")
public class I18nController {
    @RequestMapping("/change")
    public  String change(HttpSession session){
        Locale locale = (Locale) session.getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
        if(Locale.CHINA.equals(locale)){
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,Locale.US);
        }else {
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,Locale.CHINA);
        }
        return "redirect:/";
    }
}

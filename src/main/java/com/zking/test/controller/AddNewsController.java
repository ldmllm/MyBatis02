package com.zking.test.controller;


import com.zking.test.model.News;
import com.zking.test.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
@RequestMapping("/news")
public class AddNewsController {
    @Autowired
    private INewsService newsService;
    @ModelAttribute
    public  void init(Model model){
        System.out.println("init.....");
        model.addAttribute("classList",new String[]{"T230","T253"});
        News news=new News();
        news.setTitle("哈哈，sb");
        model.addAttribute("news",news);
    }



    @RequestMapping("/toAdd")
//    @RequestMapping(value = "/toAdd",method = {RequestMethod.GET,RequestMethod.POST})
//    @GetMapping("/toAdd")
//    @PostMapping("/toAdd")
    public String toAdd(Model model) {
        System.out.println("add");
        String[] classList = (String[]) model.asMap().get("classList");
        System.out.println(Arrays.toString(classList));
        return "add";
    }
    @PostMapping("/add")
    public String add(ModelAndView modelAndView, @Validated News news, BindingResult bindingResult) {
        System.out.println("add");
        System.out.println(news);
        if (bindingResult.hasErrors()) {
            System.out.println("不通过");
            return "add";
        }else{
            System.out.println("通过");
        }
        newsService.addNews(news);
        modelAndView.setViewName("redirect:/news/toAdd");
        return "add";
    }

}

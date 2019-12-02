package com.zking.test.service;

import com.zking.test.model.News;
import com.zking.test.vo.NewsVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;




public class INewsServiceTest extends BaseTestCase {
    @Autowired
    private INewsService newsService;


    private  News news;

    private NewsVo newsVo;
    @Override
    public void before() {
        super.before();
        news=new News();
        newsVo=new NewsVo();
    }

    @Test
    public void loadCasecode() throws Exception {
        System.out.println("你好");
        news.setNewsId(5);
        News news1 = newsService.loadCasecode(news);
        System.out.println(news1);
        System.out.println(news1.getCategoryList());
    }


    @Test
    public void addCategory() throws Exception {
        newsVo.setNewsId(2);
        newsVo.setCategoryId(1);
        newsService.addCategory(newsVo);
    }

    @Test
    public void removeCategory() throws Exception {
        newsVo.setNewsId(1);
        newsVo.setCategoryId(1);
        newsService.removeCategpruy(newsVo);
    }

    @Test
    public void del() throws Exception {
       news.setNewsId(2);
        newsService.del(news);
    }

}
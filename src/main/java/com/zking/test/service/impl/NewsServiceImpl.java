package com.zking.test.service.impl;

import com.zking.test.mapper.NewsMapper;
import com.zking.test.model.News;
import com.zking.test.service.INewsService;
import com.zking.test.vo.NewsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements INewsService {
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public News loadCasecode(News news) {
        return newsMapper.loadCasecode(news);
    }

    @Override
    public int addCategory(NewsVo newsVo) {
        return newsMapper.addCategory(newsVo);
    }

    @Override
    public int removeCategpruy(NewsVo newsVo) {
        return newsMapper.removeCategpruy(newsVo);
    }


    @Override
    public int del(News news) {
        newsMapper.deleteNewsCategory(news);
        return newsMapper.deleteByPrimaryKey(news.getNewsId());
    }

    @Override
    public int addNews(News news) {
        return newsMapper.insert(news);
    }
}

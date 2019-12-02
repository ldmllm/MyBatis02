package com.zking.test.service;

import com.zking.test.model.News;
import com.zking.test.vo.NewsVo;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface INewsService {
    @Transactional(readOnly = true)
    News loadCasecode(News news);

    int addCategory(NewsVo newsVo);

    int removeCategpruy(NewsVo newsVo);

    int del(News news);

    int addNews(News news);

}

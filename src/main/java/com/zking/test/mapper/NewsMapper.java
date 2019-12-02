package com.zking.test.mapper;

import com.zking.test.model.News;
import com.zking.test.vo.NewsVo;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer newsId);

    int deleteNewsCategory(News record);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsId);

    News loadCasecode(News record);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);


    int addCategory(NewsVo newsVo);

    int removeCategpruy(NewsVo newsVo);
}
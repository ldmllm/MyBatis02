package com.zking.test.vo;

import com.zking.test.model.News;
import lombok.Data;

@Data
public class NewsVo extends News{
    private Integer  categoryId;



    public static void main(String[] args) {
        NewsVo n=new NewsVo();


    }
}



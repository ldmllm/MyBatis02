package com.zking.test.model;

import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@ToString(exclude = {"categoryList"})
public class News {
    @NotNull(message = "新闻编号不能为空")
    private Integer newsId;
    @NotBlank(message = "标题不能为空")
    private String title;

    private List<Category> categoryList=new ArrayList<Category>();

    public News(Integer newsId, String title) {
        this.newsId = newsId;
        this.title = title;
    }

    public News() {
        super();
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
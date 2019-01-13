package com.itheima.dao;

import com.itheima.entity.Article;

import java.util.List;

public interface ArticleDao {
    Article findById(Integer id);

    List<Article> findAll();
}

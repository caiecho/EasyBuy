package com.itheima.dao;

import com.itheima.entity.Article;

public interface ArticleDao {
    Article findById(Integer id);
}

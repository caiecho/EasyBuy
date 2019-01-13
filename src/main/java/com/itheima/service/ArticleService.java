package com.itheima.service;

import com.itheima.dao.ArticleDao;
import com.itheima.entity.Article;

import java.util.List;

public class ArticleService {
    private ArticleDao articleDao;

    public Article findArticleById(Integer id) {
        return articleDao.findById(id);
    }

    public List<Article> findAll() {
        return articleDao.findAll();
    }
}

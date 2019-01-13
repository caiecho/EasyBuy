package com.itheima.controller;

import com.itheima.entity.Article;
import com.itheima.service.ArticleService;

import java.util.List;

public class ArticleController {
    private ArticleService articleService;

    public Article findArticleById(Integer id) {
        Article article = articleService.findArticleById(id);
        return article;
    }

    public List<Article> findAll() {
        List<Article> articles = articleService.findAll();
        return articles;
    }
}

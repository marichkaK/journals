package com.websystique.springboot.service;

import com.websystique.springboot.model.Article;

import java.util.List;

public interface ArticleService {
    Article findById(Long id);

    void deleteById(Long id);

    void deleteAllArticles();

    List<Article> findAllArticles();
}

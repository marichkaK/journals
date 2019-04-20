package com.websystique.springboot.service;

import com.websystique.springboot.model.Article;
import com.websystique.springboot.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article findById(Long id) {
        return articleRepository.findOne(id);
    }

    @Override
    public void deleteById(Long id) {
        articleRepository.delete(id);
    }

    @Override
    public void deleteAllArticles() {
        articleRepository.deleteAll();
    }

    @Override
    public List<Article> findAllArticles() {
        return articleRepository.findAll();
    }
}

package com.websystique.springboot.repositories;

import com.websystique.springboot.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}

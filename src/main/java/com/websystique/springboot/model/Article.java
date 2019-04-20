package com.websystique.springboot.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "popularity")
    private Integer popularity;

    @Column(name = "content")
    private String content;

    @Column(name = "photo_path")
    private String photoPath;

    @OneToMany(mappedBy = "article")
    private List<ArticleLike> articleLikes;

}

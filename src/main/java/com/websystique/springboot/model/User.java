package com.websystique.springboot.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @Column(name = "user_name")
    private String username;

    @Column(name = "password")
    private Integer password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<ArticleLike> userLikes;

}

package com.alkemy.disney.disney.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "charactr")
@Getter
@Setter

public class CharactersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String image;

    private String name;

    private Long age;

    private Long weight;

    private String story;

    @ManyToMany(mappedBy = "charactrs", cascade = CascadeType.ALL)
    private List<MoviesEntity> movies = new ArrayList<>();


}

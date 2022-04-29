package com.demoorg.demowebapp.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Hobbies")
@Getter
@Setter

public class Hobbies
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="hobbies_id")
    private Long hobbies_id;
    private String name;
}

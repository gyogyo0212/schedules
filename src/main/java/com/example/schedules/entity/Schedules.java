package com.example.schedules.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "schedules")

public class Schedules extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String toDo;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String passWord;

    public Schedules (){}





    public Schedules(String toDo, String userName, String passWord) {
        this.toDo = toDo;
        this.userName = userName;
        this.passWord = passWord;
    }
}

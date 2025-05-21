package com.managementsystem.poc.skillswapapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Skill {
    @Id
    private Long id;
    private String name;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String category;
}

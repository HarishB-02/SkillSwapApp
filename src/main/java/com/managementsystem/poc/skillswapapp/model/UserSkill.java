package com.managementsystem.poc.skillswapapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserSkill {
    @Id
    private Long id;
    private Long userId;
    private Long skillId;
    private String level;
}

package com.example.SpringTest.domain;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class User {
    private String name;

    @NotNull(message = "L'âge ne peut pas être vide.")
    @Min(value = 18, message = "L'âge doit être au moins de 18 ans.")
    @Max(value = 120, message = "L'âge ne peut pas être supérieur à 120 ans.")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

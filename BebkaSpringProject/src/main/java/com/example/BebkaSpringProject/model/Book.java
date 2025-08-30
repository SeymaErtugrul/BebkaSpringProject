package com.example.BebkaSpringProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Type;
@Data
@Entity
@AllArgsConstructor
@Table(name="books",schema = "public")
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue
    long id;

    String author;
    String title;

}

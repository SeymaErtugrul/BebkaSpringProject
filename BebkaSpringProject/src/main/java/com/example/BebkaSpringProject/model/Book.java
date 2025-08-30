package com.example.BebkaSpringProject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Type;
import java.util.List;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    @JsonBackReference
    private Student student;


}

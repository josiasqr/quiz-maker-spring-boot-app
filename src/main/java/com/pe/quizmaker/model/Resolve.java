package com.pe.quizmaker.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "resolve")
public class Resolve {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String dni;
  @ManyToOne(targetEntity = Quiz.class, cascade = CascadeType.ALL)
  @JoinColumn(name = "quiz_id", referencedColumnName = "id")
  private Quiz quiz;
}

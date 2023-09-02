package com.pe.quizmaker.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "questions")
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(nullable = false)
  private String question;

  @OneToMany(targetEntity = Answer.class, cascade = CascadeType.ALL)
  @JoinColumn(name = "questions_id", referencedColumnName = "id")
  private List<Answer> answers;

  @ManyToOne(targetEntity = Category.class, cascade = CascadeType.MERGE)
  @JoinColumn(name = "category_id", referencedColumnName = "id")
  private Category category;
}

package com.pe.quizmaker.service;

import com.pe.quizmaker.model.Question;

import java.util.Optional;

public interface QuestionService {
  Iterable<Question> listQuestion();

  Optional<Question> getQuestion(Long id);

  Question createQuestion(Question question);
}

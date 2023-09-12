package com.pe.quizmaker.service;

import com.pe.quizmaker.model.Quiz;

import java.util.Optional;

public interface QuizService {
  Iterable<Quiz> list();
  Optional<Quiz> findQuiz(Long id);
  Quiz create(Quiz quiz);
}

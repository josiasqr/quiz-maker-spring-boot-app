package com.pe.quizmaker.service;

import com.pe.quizmaker.model.Quiz;

public interface QuizService {
  Iterable<Quiz> list();
  
  Quiz create(Quiz quiz);
}

package com.pe.quizmaker.service.impl;

import com.pe.quizmaker.model.Quiz;
import com.pe.quizmaker.repository.QuizRepository;
import com.pe.quizmaker.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {
  private final QuizRepository quizRepository;
  
  @Override
  public Iterable<Quiz> list() {
    return quizRepository.findAll();
  }
  
  @Override
  public Quiz create(Quiz quiz) {
    return quizRepository.save(quiz);
  }
}

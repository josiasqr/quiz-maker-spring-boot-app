package com.pe.quizmaker.service;

import com.pe.quizmaker.model.Question;
import com.pe.quizmaker.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
  private final QuestionRepository questionRepository;

  @Override
  public Iterable<Question> listQuestion() {
    return questionRepository.findAll();
  }

  @Override
  public Optional<Question> getQuestion(Long id) {
    return questionRepository.findById(id);
  }

  @Override
  public Question createQuestion(Question question) {
    return questionRepository.save(question);
  }
}

package com.pe.quizmaker.controller;

import com.pe.quizmaker.model.Question;
import com.pe.quizmaker.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
@RequiredArgsConstructor
public class QuestionController {
  private final QuestionService questionService;

  @GetMapping
  public ResponseEntity<Iterable<Question>> listQuestions() {
    return ResponseEntity.ok(questionService.listQuestion());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Question> getQuestion(@PathVariable Long id) {
    return questionService.getQuestion(id)
          .map(ResponseEntity::ok)
          .orElseGet(() -> ResponseEntity.noContent().build());
  }

  @PostMapping
  public ResponseEntity<Question> create(@RequestBody Question question) {
    return ResponseEntity.status(HttpStatus.CREATED).body(questionService.createQuestion(question));
  }
}

package com.pe.quizmaker.controller;

import com.pe.quizmaker.model.Quiz;
import com.pe.quizmaker.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/quiz")
public class QuizController {
  private final QuizService quizService;
  
  @GetMapping
  public ResponseEntity<Iterable<Quiz>> lists() {
    return ResponseEntity.ok(quizService.list());
  }
  
  @RequestMapping
  public ResponseEntity<Quiz> create(@RequestBody Quiz quiz) {
    return ResponseEntity.ok(quizService.create(quiz));
  }
}

package com.pe.quizmaker.controller;

import com.pe.quizmaker.model.Quiz;
import com.pe.quizmaker.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/quiz")
public class QuizController {
  private final QuizService quizService;
  
  @GetMapping
  public ResponseEntity<Iterable<Quiz>> lists() {
    return ResponseEntity.ok(quizService.list());
  }
  
  @GetMapping("/{id}")
  public ResponseEntity<Quiz> getQuiz(@PathVariable Long id){
    return quizService.findQuiz(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }
  @RequestMapping
  public ResponseEntity<Quiz> create(@RequestBody Quiz quiz) {
    return ResponseEntity.ok(quizService.create(quiz));
  }
}

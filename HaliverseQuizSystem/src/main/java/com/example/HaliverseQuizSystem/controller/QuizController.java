package com.example.HaliverseQuizSystem.controller;

import com.example.HaliverseQuizSystem.dto.QuizAnswerDto;
import com.example.HaliverseQuizSystem.exception.QuizException;
import com.example.HaliverseQuizSystem.model.Quiz;
import com.example.HaliverseQuizSystem.model.QuizStatus;
import com.example.HaliverseQuizSystem.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/quizzes")
public class QuizController {
	@Autowired
	private QuizService quizService;
	@PostMapping
	public Quiz createQuiz(@RequestBody Quiz quiz) throws QuizException {
		return quizService.createQuiz(quiz);
	}
	@GetMapping("/active")
	public List<Quiz> getActiveQuiz() throws QuizException {
		return quizService.getActiveQuiz();
	}
	@GetMapping("/{id}/result")
	public QuizAnswerDto getQuizResult(@PathVariable Long id) throws QuizException {
		return quizService.getQuizResult(id);
	}
	@GetMapping("/all")
	public List<Quiz> getAllQuizzes() throws QuizException {
		return quizService.getAllQuizzes();
	}
}
